package com.example.Course.Registration.System.service;


import com.example.Course.Registration.System.model.Login;
import com.example.Course.Registration.System.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private LoginRepository loginRepository;

    public boolean validateUser(String username, String password) {
        Login user = loginRepository.findByUsernameAndPassword(username, password);
        return user != null;
    }
}
