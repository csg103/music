package com.music.demo.dao.dao.mybatis;

import com.music.demo.dao.entity.mybatis.ProductOwner;
import com.music.demo.dao.entity.mybatis.ProductOwnerExample;
import tk.mybatis.mapper.common.Mapper;

public interface ProductOwnerMapper extends Mapper<ProductOwner> {
    long countByExample(ProductOwnerExample example);
}