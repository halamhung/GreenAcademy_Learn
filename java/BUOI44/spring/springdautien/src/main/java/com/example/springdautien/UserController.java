package com.example.springdautien;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/user")
public User user(@RequestParam(value = "name", defaultValue = "no name") String name){

        return new User(name, 20, 100);
}
}
