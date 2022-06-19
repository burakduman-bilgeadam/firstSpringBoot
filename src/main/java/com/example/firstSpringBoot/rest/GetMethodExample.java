package com.example.firstSpringBoot.rest;

import com.example.firstSpringBoot.Address;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetMethodExample {
    private Address address;

    public  GetMethodExample(Address address){
        this.address = address;
    }

    @RequestMapping(method = RequestMethod.GET,
            value = "/test")
    public String exampleOne(){
        return "Burak Duman";
    }

    @RequestMapping(method = RequestMethod.GET,
    value = "/test2")
    public Address exampleTwo(){
        return this.address;
    }


}
