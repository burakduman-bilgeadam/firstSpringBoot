package com.example.firstSpringBoot;

import com.example.firstSpringBoot.example.District;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.firstSpringBoot")
public class Config {

    @Bean
    public Address getAddress(){
        return new Address("Wall","1231");
    }

    @Bean
    public District getDistrict(){
        return new District("Çankaya","10000000");
    }
}
