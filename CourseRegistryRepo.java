package com.example.Course.Registration.System.repository;

import com.example.Course.Registration.System.model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CourseRegistryRepo extends JpaRepository<CourseRegistry,Integer> {



}


