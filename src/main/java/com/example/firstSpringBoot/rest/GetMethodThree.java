package com.example.firstSpringBoot.rest;

import com.example.firstSpringBoot.Address;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GetMethodThree {
    private Address address;

    public GetMethodThree(Address address){
        this.address=address;
    }

    @GetMapping("/test4")
    @ResponseBody
    public Address test(){
        return this.address;
    }
}
