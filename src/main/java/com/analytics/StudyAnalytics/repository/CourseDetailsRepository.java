package com.analytics.StudyAnalytics.repository;

import com.analytics.StudyAnalytics.model.CourseDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseDetailsRepository extends MongoRepository<CourseDetails, String> {
    List<CourseDetails> findAll();
}
