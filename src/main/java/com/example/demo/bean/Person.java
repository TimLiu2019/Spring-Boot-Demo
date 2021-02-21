package com.example.demo.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.*;

@ConfigurationProperties(prefix="person")
@Component
@ToString
@Data
public class Person {
    private String userName;
    private boolean boss;
    private Date birth;
    private Integer age;
    private Pet pet;
    private String[] interests;
    private List<String> animal;
    private Map<String , Object> score;
    private Set<Double> salary;
    private Map<String, List<Pet>> allPets;
}
