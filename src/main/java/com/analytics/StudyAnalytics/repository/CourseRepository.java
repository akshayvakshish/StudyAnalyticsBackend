package com.analytics.StudyAnalytics.repository;

import com.analytics.StudyAnalytics.model.Course;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CourseRepository extends MongoRepository<Course, String> {
    List<Course> findAll();
}
