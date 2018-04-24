package com.music.demo.dao.dao.mybatis;

import com.music.demo.dao.entity.mybatis.ProductRel;
import com.music.demo.dao.entity.mybatis.ProductRelExample;
import tk.mybatis.mapper.common.Mapper;

public interface ProductRelMapper extends Mapper<ProductRel> {
    long countByExample(ProductRelExample example);
}