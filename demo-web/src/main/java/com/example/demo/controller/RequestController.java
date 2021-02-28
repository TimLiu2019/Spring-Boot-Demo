package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
public class RequestController {
    @GetMapping("/goto")
    public String goToPage(HttpServletRequest request){
        request.setAttribute("msg", "success");
        request.setAttribute("code", 200);
        return "forward:/success";
    }
    @GetMapping("/params")
    public String testParams( Map<String, Object> map,
                              Model model,
                              HttpServletRequest request,
                              HttpServletResponse response


    ){
        map.put("hello_map", "world of model");
        model.addAttribute("hello_model", "world of model");
        request.setAttribute("hello_request", "world of request");
        Cookie cookie = new Cookie("a1", "c1");
        cookie.setDomain("localhost");
        response.addCookie(cookie);
        return "forward:/success";
    }

    @ResponseBody
    @GetMapping("/success")
    public Map success(//@RequestAttribute("msg") String msg,
                    //   @RequestAttribute("code") Integer code,
                       HttpServletRequest request
                       ){
      //  Object msg1 = request.getAttribute("msg");
        Object code1 = request.getAttribute("code");
        Object helloMap = request.getAttribute("hello_map");
        Object helloModel = request.getAttribute("hello_model");
        Object helloRequest = request.getAttribute("hello_request");
        Map<String, Object> map = new HashMap<>();
   //     map.put("request_msg", msg1);
        map.put("request_code", code1);
      //  map.put("annotation_msg", msg);
    //    map.put("annotation_code",code);

        map.put("helloMap", helloMap);
        map.put("helloModel", helloModel);
        map.put("helloRequest", helloRequest);

        return map;

    }
}
