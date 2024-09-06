package com.example.api_mysql.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HomeController {
    @GetMapping("/")
    public String Home() {
        return "Home page";
    }
    @PostMapping("/product")
    public String Product(){
        return "Product page";
    }
    @PostMapping("")
    public String ProductPost(){
        return "Product page";
    }
    @DeleteMapping
    public String ProductDelete(){
        return "Product Delete page";
    }
    @PutMapping
    public String ProductPut(){
        return "Product Put page";
    }

}
