package com.music.demo.product.controller;

import com.music.demo.aliyunvideo.vo.returnvo.ReturnProductMes;
import com.music.demo.dao.entity.mybatis.ProductDetail;
import com.music.demo.dao.entity.mybatis.ProductMes;
import com.music.demo.product.service.ProductService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

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

        ReturnProductMes rp=    productService.getProductIndex();
        mv.setViewName("model/PC/index");
        mv.addObject("listProductType",rp.getListProductType());
        mv.addObject("listCourseRecommend",rp.getListCourseRecommend());

        return mv;
    }

    @RequestMapping("/getProductType")
    @ResponseBody
    public ReturnProductMes getVideoTyoe() {

        ReturnProductMes rp=    productService.getProductIndex();


        return rp;
    }
    @RequestMapping("/getDetail/{productId}")
    public ModelAndView getDetail(@PathVariable("productId") String productId) {
        ModelAndView mv =new ModelAndView();

        ProductMes pm=    productService.getProductMes(productId);
        List<ProductDetail>  pmlist=    productService.getProductDetail(productId);

        mv.setViewName("model/PC/details");
        mv.addObject("productId",productId);
        mv.addObject("productMes",pm);
        mv.addObject("productDetailList",pmlist);
        return mv;
    }






}