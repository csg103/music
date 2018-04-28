package com.music.demo.aliyunvideo.vo.returnvo;

import java.util.List;

public class ReturnProductMes {
//      类型  音乐 画画等
    List<ProductType> listProductType;
//二级分类  钢琴 吉他 架子鼓

//精品推荐视频
    List<CourseRecommend> listCourseRecommend;
    public List<ProductType> getListProductType() {
        return listProductType;
    }

    public void setListProductType(List<ProductType> listProductType) {
        this.listProductType = listProductType;
    }



    public List<CourseRecommend> getListCourseRecommend() {
        return listCourseRecommend;
    }

    public void setListCourseRecommend(List<CourseRecommend> listCourseRecommend) {
        this.listCourseRecommend = listCourseRecommend;
    }





}
