package com.music.demo.aliyunvideo.Utils;


import org.springframework.util.StringUtils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class VOUtils {

    public static Map voReflect( Object model) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        // 获取实体类的所有属性，返回Field数组
        Field[] field = model.getClass().getDeclaredFields();
        // 获取属性的名字
        String[] modelName = new String[field.length];
        String[] modelType = new String[field.length];
        Map<String,String> map = new HashMap<String,String>();
        for (int i = 0; i < field.length; i++) {
            // 获取属性的名字
            String name = field[i].getName();
            modelName[i] = name;
            // 获取属性类型
            String type = field[i].getGenericType().toString();
            modelType[i] = type;

            //关键。。。可访问私有变量
            field[i].setAccessible(true);
            //给属性设置
            //field[i].set(model,  field[i].getType().getConstructor(field[i].getType()).newInstance("kou"));

            // 将属性的首字母大写
            name = name.replaceFirst(name.substring(0, 1), name.substring(0, 1)
                    .toUpperCase());
            String value = "";
            Method m = model.getClass().getMethod("get" + name);
            if (type.equals("class java.lang.String")) {
                // 如果type是类类型，则前面包含"class "，后面跟类名

                // 调用getter方法获取属性值
                value = (String) m.invoke(model);
                if (value != null) {

                   // System.out.println(name + "attribute value:" + value);
                }

            }
            if (type.equals("class java.lang.Long")) {

                Long longvalue = (Long) m.invoke(model);
                value = longvalue.toString();
                if (value != null) {
                  //  System.out.println("attribute value:" + longvalue);
                }
            }
            if(!StringUtils.isEmpty(value))
            map.put(name,value);

        }
        return map;
    }
}
