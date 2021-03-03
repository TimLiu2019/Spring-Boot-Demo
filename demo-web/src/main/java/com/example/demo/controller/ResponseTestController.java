package com.example.demo.controller;

import com.example.demo.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class ResponseTestController {
    @ResponseBody
    @GetMapping("/test/person")
    public Person getPerson()
    {
        Person person = new Person();
        person.setAge(30);
        person.setUserName("Tom");
        person.setBirth(new Date());

        return person;
    }
}
