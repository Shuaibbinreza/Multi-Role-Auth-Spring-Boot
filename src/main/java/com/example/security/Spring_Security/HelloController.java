package com.example.security.Spring_Security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String check(){
        return "Just Checking";
    }

    @GetMapping("/check")
    public String check2(){
        return "Just Checking under /check";
    }
}
