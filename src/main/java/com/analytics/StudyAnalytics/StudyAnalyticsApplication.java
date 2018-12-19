package com.analytics.StudyAnalytics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class StudyAnalyticsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyAnalyticsApplication.class, args);
	}

}

