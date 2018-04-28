package com.music.demo.product.controller;

import com.music.demo.aliyunvideo.vo.returnvo.ReturnProductMes;
import com.music.demo.product.service.ProductService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService picListService;

    @RequestMapping("/addPicList")
    @RequiresPermissions("productPic:add")//权限管理;
    public String addPicList(HashMap<String, Object> map) {
//        PicList pic = new PicList();
//        pic.setId("323222");
//        pic.setProductPicListId("2");
//        pic.setProductPicUrl("3");
//        picListService.addPicList(pic);
        return "1234";
    }

    @RequestMapping({"/","/getProductIndex"})
    public ModelAndView getProdctTyoe() {
        ModelAndView mv =new ModelAndView();

    ReturnProductMes rp=    picListService.getProductIndex();
        mv.setViewName("model/PC/index");
        mv.addObject("listProductType",rp.getListProductType());
        mv.addObject("listCourseRecommend",rp.getListCourseRecommend());

        return mv;
    }



}