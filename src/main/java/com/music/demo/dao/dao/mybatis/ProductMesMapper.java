package com.music.demo.dao.dao.mybatis;

import com.music.demo.dao.entity.mybatis.ProductMes;
import com.music.demo.dao.entity.mybatis.ProductMesExample;
import tk.mybatis.mapper.common.Mapper;

public interface ProductMesMapper extends Mapper<ProductMes> {
    long countByExample(ProductMesExample example);
}