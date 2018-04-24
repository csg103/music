package com.music.demo.dao.dao.mybatis;

import com.music.demo.dao.entity.mybatis.PicList;
import com.music.demo.dao.entity.mybatis.PicListExample;
import tk.mybatis.mapper.common.Mapper;

public interface PicListMapper extends Mapper<PicList> {
    long countByExample(PicListExample example);
}