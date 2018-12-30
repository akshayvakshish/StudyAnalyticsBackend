package com.analytics.StudyAnalytics.model;


import java.util.List;

public class Syllabu {

        private String topic;
        private List<String> subtopics = null;

        public String getTopic() {
            return topic;
        }

        public void setTopic(String topic) {
            this.topic = topic;
        }

        public List<String> getSubtopics() {
            return subtopics;
        }

        public void setSubtopics(List<String> subtopics) {
            this.subtopics = subtopics;
        }

    }

