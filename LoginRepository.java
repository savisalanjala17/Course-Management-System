package com.example.Course.Registration.System.repository;



import com.example.Course.Registration.System.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, String> {
    Login findByUsernameAndPassword(String username, String password);
}
