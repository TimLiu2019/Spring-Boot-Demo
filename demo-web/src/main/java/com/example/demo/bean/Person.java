package com.example.demo.bean;

import lombok.Data;

import java.util.Date;

/**
 *     name： <input name="userName"/> <br/>
 *     age： <input name="age"/> <br/>
 *     dob： <input name="birth"/> <br/>
 *     pet name：<input name="pet.name"/><br/>
 *     pet age：<input name="pet.age"/>
 */
@Data
public class Person {

    private String userName;
    private Integer age;
    private Date birth;
    private Pet pet;

}