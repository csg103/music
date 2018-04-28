package com.music.demo.aliyunvideo.vo.returnvo;

import java.util.List;

public class ProductDatilType {
    private String productParentId;
    private String productParentName;

    public List<CourseRecommend> getCourseRecommend() {
        return courseRecommend;
    }

    public void setCourseRecommend(List<CourseRecommend> courseRecommend) {
        this.courseRecommend = courseRecommend;
    }

    private List<CourseRecommend> courseRecommend;
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