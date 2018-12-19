package com.analytics.StudyAnalytics.service;

import com.analytics.StudyAnalytics.model.Course;
import com.analytics.StudyAnalytics.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService{
    @Autowired
    CourseRepository courseRepository;
    public List<Course> getAllCourses() throws Exception {
        List<Course> c = courseRepository.findAll();
        //System.out.println(c.getCourseDetails());
        return c;
    }
}
