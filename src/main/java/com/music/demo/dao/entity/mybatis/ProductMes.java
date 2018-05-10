package com.music.demo.dao.entity.mybatis;

import javax.persistence.*;

@Table(name = "t_product_mes")
public class ProductMes {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "c_course_id")
    private String courseId;

    @Column(name = "c_course_name")
    private String courseName;

    @Column(name = "c_course_type")
    private String courseType;

    @Column(name = "c_course_isfree")
    private String courseIsfree;

    @Column(name = "c_course_introduction")
    private String courseIntroduction;

    @Column(name = "c_course_owner_id")
    private String courseOwnerId;

    @Column(name = "c_course_teacher")
    private String courseTeacher;

    @Column(name = "c_course_times")
    private String courseTimes;

    @Column(name = "c_course_creater")
    private String courseCreater;

    @Column(name = "c_course_top_order")
    private String courseTopOrder;

    @Column(name = "c_product_middle_pic_list_id")
    private String productMiddlePicListId;

    @Column(name = "c_course_pic_url")
    private String coursePicUrl;

    @Column(name = "c_course_num")
    private String courseNum;

    @Column(name = "c_course_diffculty")
    private String courseDiffculty;

    @Column(name = "c_course_sale_price")
    private String courseSalePrice;

    @Column(name = "c_course_price")
    private String coursePrice;

    @Column(name = "c_text1")
    private String text1;

    @Column(name = "c_text2")
    private String text2;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return c_course_id
     */
    public String getCourseId() {
        return courseId;
    }

    /**
     * @param courseId
     */
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    /**
     * @return c_course_name
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * @return c_course_type
     */
    public String getCourseType() {
        return courseType;
    }

    /**
     * @param courseType
     */
    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    /**
     * @return c_course_isfree
     */
    public String getCourseIsfree() {
        return courseIsfree;
    }

    /**
     * @param courseIsfree
     */
    public void setCourseIsfree(String courseIsfree) {
        this.courseIsfree = courseIsfree;
    }

    /**
     * @return c_course_introduction
     */
    public String getCourseIntroduction() {
        return courseIntroduction;
    }

    /**
     * @param courseIntroduction
     */
    public void setCourseIntroduction(String courseIntroduction) {
        this.courseIntroduction = courseIntroduction;
    }

    /**
     * @return c_course_owner_id
     */
    public String getCourseOwnerId() {
        return courseOwnerId;
    }

    /**
     * @param courseOwnerId
     */
    public void setCourseOwnerId(String courseOwnerId) {
        this.courseOwnerId = courseOwnerId;
    }

    /**
     * @return c_course_teacher
     */
    public String getCourseTeacher() {
        return courseTeacher;
    }

    /**
     * @param courseTeacher
     */
    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    /**
     * @return c_course_times
     */
    public String getCourseTimes() {
        return courseTimes;
    }

    /**
     * @param courseTimes
     */
    public void setCourseTimes(String courseTimes) {
        this.courseTimes = courseTimes;
    }

    /**
     * @return c_course_creater
     */
    public String getCourseCreater() {
        return courseCreater;
    }

    /**
     * @param courseCreater
     */
    public void setCourseCreater(String courseCreater) {
        this.courseCreater = courseCreater;
    }

    /**
     * @return c_course_top_order
     */
    public String getCourseTopOrder() {
        return courseTopOrder;
    }

    /**
     * @param courseTopOrder
     */
    public void setCourseTopOrder(String courseTopOrder) {
        this.courseTopOrder = courseTopOrder;
    }

    /**
     * @return c_product_middle_pic_list_id
     */
    public String getProductMiddlePicListId() {
        return productMiddlePicListId;
    }

    /**
     * @param productMiddlePicListId
     */
    public void setProductMiddlePicListId(String productMiddlePicListId) {
        this.productMiddlePicListId = productMiddlePicListId;
    }

    /**
     * @return c_course_pic_url
     */
    public String getCoursePicUrl() {
        return coursePicUrl;
    }

    /**
     * @param coursePicUrl
     */
    public void setCoursePicUrl(String coursePicUrl) {
        this.coursePicUrl = coursePicUrl;
    }

    /**
     * @return c_course_num
     */
    public String getCourseNum() {
        return courseNum;
    }

    /**
     * @param courseNum
     */
    public void setCourseNum(String courseNum) {
        this.courseNum = courseNum;
    }

    /**
     * @return c_course_diffculty
     */
    public String getCourseDiffculty() {
        return courseDiffculty;
    }

    /**
     * @param courseDiffculty
     */
    public void setCourseDiffculty(String courseDiffculty) {
        this.courseDiffculty = courseDiffculty;
    }

    /**
     * @return c_course_sale_price
     */
    public String getCourseSalePrice() {
        return courseSalePrice;
    }

    /**
     * @param courseSalePrice
     */
    public void setCourseSalePrice(String courseSalePrice) {
        this.courseSalePrice = courseSalePrice;
    }

    /**
     * @return c_course_price
     */
    public String getCoursePrice() {
        return coursePrice;
    }

    /**
     * @param coursePrice
     */
    public void setCoursePrice(String coursePrice) {
        this.coursePrice = coursePrice;
    }

    /**
     * @return c_text1
     */
    public String getText1() {
        return text1;
    }

    /**
     * @param text1
     */
    public void setText1(String text1) {
        this.text1 = text1;
    }

    /**
     * @return c_text2
     */
    public String getText2() {
        return text2;
    }

    /**
     * @param text2
     */
    public void setText2(String text2) {
        this.text2 = text2;
    }
}