package com.example.Course.Registration.System.repository;

import com.example.Course.Registration.System.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
}

