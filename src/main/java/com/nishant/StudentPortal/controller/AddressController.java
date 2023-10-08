package com.nishant.StudentPortal.controller;


import com.nishant.StudentPortal.model.Address;
import com.nishant.StudentPortal.service.AddressService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("addresses")
public class AddressController {
    @Autowired
    AddressService service;

    /*
    POST
     */

    @PostMapping()
    public Address addAddress(@RequestBody @Valid Address address){
        return service.addAddress(address);
    }

    /*
    GET
     */

    @GetMapping
    public List<Address> getAll(){
        return service.getAll();
    }

    /*
    DELETE
     */

    @DeleteMapping("{id}")
    public String deleteAddress(@PathVariable Long id){
        return service.deleteAddress(id);
    }
}
