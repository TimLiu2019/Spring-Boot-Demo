package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class ParameterTestController {
    // /car/id/owner/name?age=18&interests=basketball&interests=game
    @GetMapping("/car/{id}/owner/{userName}")
    public Map<String, Object> getCar(@PathVariable("id") Integer id,
                                      @PathVariable("userName") String name,
                                      @PathVariable Map<String, String> pv,
                                      @RequestHeader("User-Agent") String userAgent,
                                      @RequestHeader Map<String,String> header,
                                      @RequestParam("age") Integer age,
                                      @RequestParam("interests") List<String> interests,
                                      @RequestParam Map<String, String> params
                                  //    @CookieValue("_ga") String _ga


    ){
        Map<String, Object> map = new HashMap<>();
        map.put("id",id);
        map.put("userName",name);
        map.put("pv",pv);
        map.put("userAgent", userAgent);
        map.put("headers",header);
        map.put("age",age);
        map.put("interests",interests);
        map.put("params",params);
       // map.put("_ga", _ga);

        return map;
    }
     @PostMapping("/api/save")
    public Map PostMethod(@RequestBody String contentBody){
        Map<String, Object> map = new HashMap<>();
        map.put("formBody", contentBody);
        return map;
    }
}
