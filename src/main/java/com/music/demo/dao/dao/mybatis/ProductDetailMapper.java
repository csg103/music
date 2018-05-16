package com.music.demo.dao.dao.mybatis;

import com.music.demo.dao.entity.mybatis.ProductDetail;
import com.music.demo.dao.entity.mybatis.ProductDetailExample;
import tk.mybatis.mapper.common.Mapper;

public interface ProductDetailMapper extends Mapper<ProductDetail> {
    long countByExample(ProductDetailExample example);
}