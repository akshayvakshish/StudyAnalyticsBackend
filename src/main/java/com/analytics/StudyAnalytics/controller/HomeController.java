package com.analytics.StudyAnalytics.controller;


import com.analytics.StudyAnalytics.model.Course;
import com.analytics.StudyAnalytics.model.Lead;
import com.analytics.StudyAnalytics.model.Student;
import com.analytics.StudyAnalytics.service.CourseService;
import com.analytics.StudyAnalytics.service.LeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    CourseService courseService;

    @Autowired
    LeadService leadService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public Student student(@RequestParam(value="name") String name, @RequestParam(value="age") Integer age){
        System.out.println(name+"-"+age);
        try {
            List<Course> c = courseService.getAllCourses();
            c.forEach((course) -> System.out.println(course.getCourseName()));
        }
        catch (Exception e){
            System.out.println("Some exception occured!");
        }
        return new Student("Akshay","10",24);
    }

    @RequestMapping(value = "/posting",method = RequestMethod.POST)
    public Student student(@RequestBody Lead lead){
        System.out.println(lead.getId()+"-"+lead.getCompanyName());
        try {
            Lead c = leadService.addLead(lead);
            System.out.println(c.getCompanyName());
        }
        catch (Exception e){
            System.out.println("Some exception occured!");
        }
        return new Student("Daksh","10",20);
    }
}
