package com.example.mini_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserRepository userRepository;

@GetMapping("/")
public ResponseEntity<List<User>> getAll(){
    try {
        List<User> stus = new ArrayList<User>();

        userRepository.findAll().forEach(stus::add);

        if (stus.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(stus, HttpStatus.OK);

    }catch (Exception e){
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
    @PostMapping("/create")
    public ResponseEntity<User> createStudent(@RequestBody User user) {
        try {
            User _user = userRepository.save(new User(user.getName(), user.getAge(),user.getPosition(), user.getSkills()));
            return new ResponseEntity<>(_user, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
