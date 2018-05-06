package com.music.demo.dao.dao.mybatis;

import com.music.demo.dao.entity.mybatis.ProductType;
import com.music.demo.dao.entity.mybatis.ProductTypeExample;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
@Repository
public interface ProductTypeMapper extends Mapper<ProductType> {
    long countByExample(ProductTypeExample example);
}