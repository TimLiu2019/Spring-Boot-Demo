package com.example.demo.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Pet {
    private String name;
    private Integer age;
}