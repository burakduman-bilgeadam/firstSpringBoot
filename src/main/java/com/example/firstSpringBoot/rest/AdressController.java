package com.example.firstSpringBoot.rest;

import com.example.firstSpringBoot.Address;
import org.apache.catalina.filters.AddDefaultCharsetFilter;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdressController {
    private Address address;

    public AdressController(Address address){
        this.address = address;
    }

    @GetMapping("/getAddress")
    public Address getAddress(){
        return this.address;
    }

    @PostMapping("/saveAddress")
    /*@RequestMapping(method=RequestMethod.POST,
            value="/saveAddress")*/
    public void addAdress(@RequestBody Address add){
        System.out.println(add.toString());
    }

    @PutMapping("/updateAddress/{id}")
    public void updateAdress(
            @RequestBody Address add,
            @PathVariable(name = "id") String id){
        System.out.println(add.toString());
        System.out.println(id);
        //20 idli data update edildi.
    }

    @DeleteMapping("/deleteAddress/{id}")
    public void deleteAddress(
            @PathVariable(name="id") Integer id){
        System.out.println(id);
    }

}
