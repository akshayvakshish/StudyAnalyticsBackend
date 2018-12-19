package com.analytics.StudyAnalytics.model;

public class Student {
    private String name;
    private String rollno;
    private Integer age;

    public Student(String name, String rollno, Integer age) {
        this.name = name;
        this.rollno = rollno;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
