package com.music.demo.product.controller;

import com.music.demo.dao.entity.mybatis.PicList;
import com.music.demo.product.service.PicListService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class PicListController {
    @Autowired
    private PicListService picListService;

    @RequestMapping("/addPicList")
    @RequiresPermissions("productPic:add")//权限管理;
    public String

    addPicList(HashMap<String, Object> map) {
        PicList pic = new PicList();
        pic.setId("323222");
        pic.setProductPicListId("2");
        pic.setProductPicUrl("3");
        picListService.addPicList(pic);
        return "1234";
    }



}