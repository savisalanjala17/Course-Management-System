package com.example.Course.Registration.System.controller;


import com.example.Course.Registration.System.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:5500", "http://127.0.0.1:5500"})
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/check")
    public String checkLogin(@RequestParam String username, @RequestParam String password) {
        boolean isValid = loginService.validateUser(username, password);
        if (isValid) {
            return "Login successful";
        } else {
            return "Invalid username or password";
        }
    }

}
