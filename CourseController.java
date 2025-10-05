package com.example.Course.Registration.System.controller;


import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistry;
import com.example.Course.Registration.System.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:5500", "http://127.0.0.1:5500"})
public class CourseController {


    @Autowired
    CourseService courseservice;

    @GetMapping("courses")
    public List<Course> availablecourse(){

        return courseservice.availablecourses();

    }


    @GetMapping("courses/enrolled")
    public List<CourseRegistry> enrolledstudents(){
        return courseservice.enrolledstudents();
    }


    @PostMapping("courses/register")
    public void enrollcourse(@RequestParam String name,
                               @RequestParam String email_id,
                               @RequestParam String course_name
                               ){
        courseservice.enrollcourse(name,email_id,course_name);

    }

    @PostMapping("/add")
    public Course addCourse(@RequestBody Course course) {
        return courseservice.addcourse(course);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCourse(@PathVariable String id) {
        courseservice.deleteCourse(id);
    }


}
