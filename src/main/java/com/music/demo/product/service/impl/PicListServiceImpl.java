package com.music.demo.product.service.impl;

import com.music.demo.dao.dao.mybatis.PicListMapper;
import com.music.demo.dao.entity.mybatis.PicList;
import com.music.demo.product.service.PicListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PicListServiceImpl implements PicListService {

    @Autowired
    private PicListMapper picListMapper;
    @Override
    public String addPicList(PicList pic) {
        picListMapper.insert(pic);
        return null;
    }
}
