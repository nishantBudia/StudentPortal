package com.nishant.StudentPortal.service;

import com.nishant.StudentPortal.model.Asset;
import com.nishant.StudentPortal.repo.AssetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AssetService {

    @Autowired
    AssetRepo repo;
    public Asset addAsset(Asset asset) {
        return repo.save(asset);
    }

    public List<Asset> getAll() {
        return repo.findAll();
    }

    public String deleteAsset(Long id) {
        repo.deleteById(id);
        return "Asset at "+ id +" deleted successfully";
    }
}
