package com.nishant.StudentPortal.service;

import com.nishant.StudentPortal.model.Address;
import com.nishant.StudentPortal.repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AddressService {
    @Autowired
    AddressRepo repo;

    public Address addAddress(Address address) {
        return repo.save(address);
    }

    public List<Address> getAll() {
        return repo.findAll();
    }

    public String deleteAddress(Long id) {
        repo.deleteById(id);
        return "Address at "+ id +" deleted successfully";
    }
}
