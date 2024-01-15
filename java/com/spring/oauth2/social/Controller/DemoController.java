package com.spring.oauth2.social.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String Home(){
        return "Hello Home";
    }

    @GetMapping("/secured")
    public String secured(){
        return "hello Secured from oAuth2- Created by Darshan";
    }
}
