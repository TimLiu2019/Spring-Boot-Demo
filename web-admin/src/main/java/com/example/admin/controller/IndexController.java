package com.example.admin.controller;

import com.example.admin.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    @GetMapping(value={"/","/login"})
    public String loginPage(){
        return "login";
    }
    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model){
        if(StringUtils.hasLength(user.getUsername()) &&  "123456".equals(user.getPassword())){
            session.setAttribute("loginUser", user);
            return "redirect:/main.html";
        } else {
            model.addAttribute("msg","error in login!");
            return "login";}

    }

    @GetMapping(value={"/main.html"})
    public String mainPage(){
        return "main";
    }
}
