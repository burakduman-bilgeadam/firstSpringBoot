package com.example.firstSpringBoot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetMethodExampleTwo {

    @GetMapping("/test3")
    public String test(){
        return "Bilge Adam";
    }



}
