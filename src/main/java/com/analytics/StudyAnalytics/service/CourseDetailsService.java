package com.analytics.StudyAnalytics.service;

import com.analytics.StudyAnalytics.model.CourseDetails;
import com.analytics.StudyAnalytics.repository.CourseDetailsRepository;
import com.analytics.StudyAnalytics.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseDetailsService {
    @Autowired
    CourseDetailsRepository coursedetailsRepository;
    public List<CourseDetails> getAllCoursesDetails() throws Exception {
        List<CourseDetails> c = coursedetailsRepository.findAll();
        System.out.println("Size: "+c.size());
        return c;
    }
}
