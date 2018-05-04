package com.music.demo.aliyunvideo.vo.returnvo;

public class CourseRecommend {
    private String coursePicUrl;
    private String courseName;
    private String courseId;
    private String courseTeacher;

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    public String getCoursePicUrl() {
        return coursePicUrl;
    }

    public void setCoursePicUrl(String coursePicUrl) {
        this.coursePicUrl = coursePicUrl;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
}