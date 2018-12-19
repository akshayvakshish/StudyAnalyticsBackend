package com.analytics.StudyAnalytics.repository;

import com.analytics.StudyAnalytics.model.Lead;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeadRepository extends MongoRepository<Lead, String> {
       Lead save(Lead lead);
}
