package com.analytics.StudyAnalytics.controller;
import com.analytics.StudyAnalytics.model.Course;
import com.analytics.StudyAnalytics.model.Lead;
import com.analytics.StudyAnalytics.model.Student;
import com.analytics.StudyAnalytics.service.CourseService;
import com.analytics.StudyAnalytics.service.LeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {
    @Autowired
    CourseService courseService;
    //@Autowired
    private Lead lead= new Lead();

    @Autowired
    LeadService leadService;
    @CrossOrigin(value="http://localhost:4200")
    @RequestMapping(value = "/test",method = RequestMethod.GET)
//    public List<Course> student1(@RequestParam(value="name") String name, @RequestParam(value="age") Integer age){
//        System.out.println(name+"-"+age);
    public List<Course> student1(){

        List<Course> c =new ArrayList<>();
        try {
            c = courseService.getAllCourses();
            c.forEach((course) -> System.out.println(course.getCourseName()));
        }
        catch (Exception e){
            System.out.println("Some exception occured!");
        }
        return c;
    }
    @CrossOrigin(value="http://localhost:4200")
    @RequestMapping(value = "/posting",method = RequestMethod.POST)
    public Lead student2(@RequestBody Lead lead){
        System.out.println(lead.getId()+"-"+lead.getCompanyName());

        try {
            lead = leadService.addLead(lead);
            System.out.println(lead.getCompanyName());
        }
        catch (Exception e){
            System.out.println("Some exception occured!");
        }
        System.out.println("called"+lead);
        return lead;
    }
}
