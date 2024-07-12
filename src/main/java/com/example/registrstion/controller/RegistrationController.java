package com.example.registrstion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.registrstion.entities.User;
import com.example.registrstion.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class RegistrationController {

 @Autowired
 private UserRepository userRepository;

 @PostMapping("/register")
 public ResponseEntity<User> registerUser(@RequestBody User user) {
     try {
         User _user = userRepository.save(new User(user.getUsername(), user.getPassword(), user.getEmail()));
         return new ResponseEntity<>(_user, HttpStatus.CREATED);
     } catch (Exception e) {
         return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
     }
 }
}
