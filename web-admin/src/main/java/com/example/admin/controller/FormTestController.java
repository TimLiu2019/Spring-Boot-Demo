package com.example.admin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * upload files
 */
@Slf4j
@Controller
public class FormTestController {
    @GetMapping("/form_layouts")
    public String form_layouts(){
       return "form/form_layouts";
    }
   @PostMapping("/upload")
    public String upload(@RequestParam("email") String email,
                         @RequestParam("userName") String userName,
                         @RequestPart("headerImg") MultipartFile headerImg,
                         @RequestPart("photos") MultipartFile[] photos) throws IOException {
        log.info("uploaded: email={},userName={},headerImg={},photos={}",
                 email,userName,headerImg.getSize(),photos.length);
        if( !headerImg.isEmpty()){
         String originalFileName =  headerImg.getOriginalFilename();
         headerImg.transferTo(new File("//Users/qitingliu 1/Documents/2021/springUploadTest//" + originalFileName));
      //
        }
        if(photos.length > 0){
            for(MultipartFile photo: photos){
                if(!photo.isEmpty()){
                    String originalFileName = photo.getOriginalFilename();
                   photo.transferTo(new File("/Users/qitingliu 1/Documents//2021/springUploadTest/photos/" + originalFileName));
                }
            }
        }

        return "main";
    }
}
