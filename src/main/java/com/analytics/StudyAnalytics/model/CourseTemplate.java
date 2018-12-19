package com.analytics.StudyAnalytics.model;

public class CourseTemplate {
    private String courseTitle;
    private String courseHeader;
    private String courseHeaderContent;
    private String courseBody;
    private String courseFooter;

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseHeader() {
        return courseHeader;
    }

    public void setCourseHeader(String courseHeader) {
        this.courseHeader = courseHeader;
    }

    public String getCourseHeaderContent() {
        return courseHeaderContent;
    }

    public void setCourseHeaderContent(String courseHeaderContent) {
        this.courseHeaderContent = courseHeaderContent;
    }

    public String getCourseBody() {
        return courseBody;
    }

    public void setCourseBody(String courseBody) {
        this.courseBody = courseBody;
    }

    public String getCourseFooter() {
        return courseFooter;
    }

    public void setCourseFooter(String courseFooter) {
        this.courseFooter = courseFooter;
    }
}
