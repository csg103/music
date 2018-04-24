package com.music.demo.dao.dao.mybatis;

import com.music.demo.dao.entity.mybatis.ProductType;
import com.music.demo.dao.entity.mybatis.ProductTypeExample;
import tk.mybatis.mapper.common.Mapper;

public interface ProductTypeMapper extends Mapper<ProductType> {
    long countByExample(ProductTypeExample example);
}