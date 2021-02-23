package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
@RestController
public class HelloController {
    //    @RequestMapping(value = "/user",method = RequestMethod.GET)
    @GetMapping("/user")
    public String getUser(){

        return "GET-works";
    }

    //    @RequestMapping(value = "/user",method = RequestMethod.POST)
    @PostMapping("/user")
    public String saveUser(){
        return "POST-works";
    }


    //    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    @PutMapping("/user")
    public String putUser(){

        return "PUT-works";
    }

    @DeleteMapping("/user")
//    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    public String deleteUser(){
        return "DELETE-works";
    }
}
