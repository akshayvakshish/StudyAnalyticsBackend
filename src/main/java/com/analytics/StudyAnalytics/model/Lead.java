package com.analytics.StudyAnalytics.model;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Document(collection="Leads")
public class Lead {
    @Id
    @NotNull
    private String id;
    @NotNull(message=" name cannot be missing or empty")
    @Size(min=2, message=" name must not be less than 2 characters")
    private String name;
    @NotNull(message=" student name cannot be missing or empty")
    @Size(min=2, message=" student name must not be less than 2 characters")
    private String isStudent;
    @NotNull(message=" company name cannot be missing or empty")
    @Size(min=2, message="company name must not be less than 2 characters")
    private String companyName;
    @Size(min=0,max=10)
    @NotNull(message="It can not be null")
    private String mobile;
    @Email(message="email is not valid")
    @NotNull(message="email can not be null")
    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsStudent() {
        return isStudent;
    }

    public void setIsStudent(String isStudent) {
        this.isStudent = isStudent;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
