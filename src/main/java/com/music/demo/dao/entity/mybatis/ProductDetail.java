package com.music.demo.dao.entity.mybatis;

import javax.persistence.*;

@Table(name = "t_product_detail")
public class ProductDetail {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "c_course_detail_id")
    private String courseDetailId;

    @Column(name = "c_course_detail_aili_id")
    private String courseDetailAiliId;

    @Column(name = "c_course_title")
    private String courseTitle;

    @Column(name = "c_course_time")
    private String courseTime;

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
     * @return c_course_detail_id
     */
    public String getCourseDetailId() {
        return courseDetailId;
    }

    /**
     * @param courseDetailId
     */
    public void setCourseDetailId(String courseDetailId) {
        this.courseDetailId = courseDetailId;
    }

    /**
     * @return c_course_detail_aili_id
     */
    public String getCourseDetailAiliId() {
        return courseDetailAiliId;
    }

    /**
     * @param courseDetailAiliId
     */
    public void setCourseDetailAiliId(String courseDetailAiliId) {
        this.courseDetailAiliId = courseDetailAiliId;
    }

    /**
     * @return c_course_title
     */
    public String getCourseTitle() {
        return courseTitle;
    }

    /**
     * @param courseTitle
     */
    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    /**
     * @return c_course_time
     */
    public String getCourseTime() {
        return courseTime;
    }

    /**
     * @param courseTime
     */
    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime;
    }
}