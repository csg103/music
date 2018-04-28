package com.music.demo.aliyunvideo.Utils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import net.sf.cglib.beans.BeanCopier;
import net.sf.cglib.core.Converter;

public class PropertiesCopyUtil {
    private static Map beanCopierMap = new ConcurrentHashMap();

    public static void copyProperties(Object source, Object target, Converter converter) {
        boolean needConverter = false;
        if (converter != null) {
            needConverter = true;
        }
        BeanCopier copier = generateCopier(source, target, needConverter);
        copier.copy(source, target, converter);
    }

    private static BeanCopier generateCopier(Object source, Object target, boolean needConverter) {
        String beanKey = generateKey(source.getClass(), target.getClass());
        if (!beanCopierMap.containsKey(beanKey)) {
            BeanCopier copier = BeanCopier.create(source.getClass(), target.getClass(), needConverter);
            beanCopierMap.put(beanKey, copier);
            return copier;
        } else {
            return (BeanCopier) beanCopierMap.get(beanKey);
        }
    }

    private static String generateKey(Class<? extends Object> class1, Class<? extends Object> class2) {
        return class1.toString() + class2.toString();
    }
}