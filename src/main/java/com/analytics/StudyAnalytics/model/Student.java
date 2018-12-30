package com.analytics.StudyAnalytics.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {

    @NotNull(message="name can,t be null")
    @Size(min=3, max=15)
    private String name;
    @NotNull(message="rollno can,t be null")
    @Size(min=3, max=15)
    private String rollno;
    @NotNull(message ="age can't be null")
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
