package com.music.demo.aliyunvideo.vo.returnvo;

import java.util.List;

public class ProductType {
        private String productParentId;

        private String productParentName;

    List<ProductDatilType> listProductDatilType;

    public List<ProductDatilType> getListProductDatilType() {
        return listProductDatilType;
    }

    public void setListProductDatilType(List<ProductDatilType> listProductDatilType) {
        this.listProductDatilType = listProductDatilType;
    }

    public String getProductParentId() {
            return productParentId;
        }

        public void setProductParentId(String productParentId) {
            this.productParentId = productParentId;
        }

        public String getProductParentName() {
            return productParentName;
        }

        public void setProductParentName(String productParentName) {
            this.productParentName = productParentName;
        }
    }