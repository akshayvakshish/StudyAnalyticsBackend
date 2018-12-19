package com.analytics.StudyAnalytics.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection="Course")
public class Course {
    @Id
    private String id;
    private String courseName;
    private String courseDescription;
    private String courseType;
    private CourseTemplate courseTemplate;
    private String courseImage;
    private String courseLearningHours;
    private List courseFaculty;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public CourseTemplate getCourseTemplate() {
        return courseTemplate;
    }

    public void setCourseTemplate(CourseTemplate courseTemplate) {
        this.courseTemplate = courseTemplate;
    }

    public String getCourseImage() {
        return courseImage;
    }

    public void setCourseImage(String courseImage) {
        this.courseImage = courseImage;
    }

    public String getCourseLearningHours() {
        return courseLearningHours;
    }

    public void setCourseLearningHours(String courseLearningHours) {
        this.courseLearningHours = courseLearningHours;
    }

    public List getCourseFaculty() {
        return courseFaculty;
    }

    public void setCourseFaculty(List courseFaculty) {
        this.courseFaculty = courseFaculty;
    }
}
