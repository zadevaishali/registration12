package com.example.registrstion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.registrstion.entities.Login;
import com.example.registrstion.repository.LoginRepository;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    @Autowired
    private LoginRepository loginRepository;

    @PostMapping("/saveUser")
    public ResponseEntity<Login> createUser(@RequestBody Login login) {
        Login savedUser = loginRepository.save(login);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
}