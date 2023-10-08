package com.nishant.StudentPortal.controller;

import com.nishant.StudentPortal.model.Address;
import com.nishant.StudentPortal.model.Asset;
import com.nishant.StudentPortal.service.AssetService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("assets")
public class AssetController {
    @Autowired
    AssetService service;

    /*
    POST
     */

    @PostMapping()
    public Asset addAsset(@RequestBody @Valid Asset asset){
        return service.addAsset(asset);
    }

    /*
    GET
     */

    @GetMapping()
    public List<Asset> getAll(){
        return service.getAll();
    }

    /*
    DELETE
     */

    @DeleteMapping("{id}")
    public String deleteAsset(@PathVariable Long id){
        return service.deleteAsset(id);
    }
}
