package com.analytics.StudyAnalytics.model;

import java.util.List;

    public class CourseDetails {

        private String courseName;
        private String courseDescription;
        private String courseType;
        private String courseUrl;
        private String coursePrice;
        private String courseOffer;

        private List<String> targetedAudience = null;
        private List<Syllabu> syllabus = null;
        private String courseHours;
        private String courseFaculity;


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

        public String getCourseUrl() {
            return courseUrl;
        }

        public void setCourseUrl(String courseUrl) {
            this.courseUrl = courseUrl;
        }

        public String getCoursePrice() {
            return coursePrice;
        }

        public void setCoursePrice(String coursePrice) {
            this.coursePrice = coursePrice;
        }

        public String getCourseOffer() {
            return courseOffer;
        }

        public void setCourseOffer(String courseOffer) {
            this.courseOffer = courseOffer;
        }

        public List<String> getTargetedAudience() {
            return targetedAudience;
        }

        public void setTargetedAudience(List<String> targetedAudience) {
            this.targetedAudience = targetedAudience;
        }

        public List<Syllabu> getSyllabus() {
            return syllabus;
        }

        public void setSyllabus(List<Syllabu> syllabus) {
            this.syllabus = syllabus;
        }

        public String getCourseHours() {
            return courseHours;
        }

        public void setCourseHours(String courseHours) {
            this.courseHours = courseHours;
        }

        public String getCourseFaculity() {
            return courseFaculity;
        }

        public void setCourseFaculity(String courseFaculity) {
            this.courseFaculity = courseFaculity;
        }

    }


       /* public int hashCode() {
            return new HashCodeBuilder().append(coursePrice).append(courseUrl).append(courseDescription).append(courseOffer).append(additionalProperties).append(targetedAudience).append(courseHours).append(syllabus).append(courseType).append(courseFaculity).append(courseName).toHashCode();
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof CourseDetails) == false) {
                return false;
            }
            CourseDetails rhs = ((CourseDetails) other);
            return new EqualsBuilder().append(coursePrice, rhs.coursePrice).append(courseUrl, rhs.courseUrl).append(courseDescription, rhs.courseDescription).append(courseOffer, rhs.courseOffer).append(additionalProperties, rhs.additionalProperties).append(targetedAudience, rhs.targetedAudience).append(courseHours, rhs.courseHours).append(syllabus, rhs.syllabus).append(courseType, rhs.courseType).append(courseFaculity, rhs.courseFaculity).append(courseName, rhs.courseName).isEquals();
        }

    }*/


