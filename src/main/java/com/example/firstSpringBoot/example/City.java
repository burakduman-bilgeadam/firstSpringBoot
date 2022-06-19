package com.example.firstSpringBoot.example;

import org.springframework.stereotype.Component;

// district ve city adında class istiyorum. City classı component olsun
//ve district inject edilsin.
// district class ı pojo olsun district -> name, population
// district class ının bean kullanarak instance inı oluşturun.
@Component
public class City {
    private  District district;

    public City(District district){
        this.district= district;
        System.out.println(this.district);
    }

    public String getDistrictName(){
        return district.getName();
    }
}
