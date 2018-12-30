package com.analytics.StudyAnalytics.service;

import com.analytics.StudyAnalytics.model.Lead;
import com.analytics.StudyAnalytics.repository.LeadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeadService {
    @Autowired
    LeadRepository leadRepository;
    public Lead addLead(Lead lead) throws Exception {

        Lead c = leadRepository.save(lead);
        //System.out.println(c.getCourseDetails());
        return c;
    }
}
