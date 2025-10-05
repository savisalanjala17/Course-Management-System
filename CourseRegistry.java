package com.example.Course.Registration.System.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class CourseRegistry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email_id;
    private String course_name;


    public CourseRegistry(String name, String email_id, String course_name) {
        this.name = name;
        this.email_id = email_id;
        this.course_name = course_name;
    }

    public CourseRegistry() {
    }
}
