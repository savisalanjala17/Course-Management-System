package com.example.Course.Registration.System.controller;

import com.example.Course.Registration.System.model.Student;
import com.example.Course.Registration.System.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:5500", "http://127.0.0.1:5500"})
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/registerStudent")
    public String registerStudent(@RequestBody Student student) {
        return studentService.registerStudent(student);
    }
}
