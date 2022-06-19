package com.example.firstSpringBoot;

import com.example.firstSpringBoot.example.District;
import org.springframework.stereotype.Component;
@Component
public class Company {
    private Address address;
    private District district;

    public Company(Address address,District district){
        this.address= address;
        this.district = district;
        System.out.println(address.toString());
    }
}
