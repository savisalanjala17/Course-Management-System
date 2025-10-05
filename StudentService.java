package com.example.Course.Registration.System.service;

import com.example.Course.Registration.System.model.Login;
import com.example.Course.Registration.System.model.Student;
import com.example.Course.Registration.System.repository.LoginRepository;
import com.example.Course.Registration.System.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private LoginRepository loginRepository;

    public String registerStudent(Student student) {
        // Check if username/email already exists
        if(studentRepository.existsByUsername(student.getUsername())) {
            return "Username already taken!";
        }
        if(studentRepository.existsByEmail(student.getEmail())) {
            return "Email already registered!";
        }

        studentRepository.save(student);
        Login login = new Login();
        login.setUsername(student.getUsername());
        login.setPassword(student.getPassword()); // hash later
        loginRepository.save(login);
        return "Registration successful";
    }
}
