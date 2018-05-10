package com.music.demo.product.service;


import com.music.demo.aliyunvideo.vo.aliyunvo.CreateUploadVideoVo;
import com.music.demo.aliyunvideo.vo.returnvo.ReturnProductMes;
import com.music.demo.dao.entity.mybatis.ProductDetail;
import com.music.demo.dao.entity.mybatis.ProductMes;
import com.music.demo.dao.entity.mybatis.ProductType;

import java.util.List;

public interface ProductService {

   //    public String addPicList(PicList pic);
//    public List<ProductType> getProdctType();
   ReturnProductMes getProductIndex();

   public List<ProductDetail> getProductMes(CreateUploadVideoVo createUploadVideoVo);
   public int saveProductDetail(ProductDetail productDetail);
   public  int updateUploadFlag(String fileName);

   public ProductMes getProductMes(String courseId);
   public List<ProductDetail> getProductDetail(String courseId);



}
