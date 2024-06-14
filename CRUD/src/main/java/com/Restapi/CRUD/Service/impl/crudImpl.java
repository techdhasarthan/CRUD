package com.Restapi.CRUD.Service.impl;

import com.Restapi.CRUD.Repository.crudRepository;
import com.Restapi.CRUD.Service.crudService;
import com.Restapi.CRUD.crud;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class crudImpl implements crudService {
    crudRepository crudRepository;

    public crudImpl(com.Restapi.CRUD.Repository.crudRepository crudRepository) {
        this.crudRepository = crudRepository;
    }

    @Override
    public String createData(crud Crud) {
       crudRepository.save(Crud);
        return "success";
    }

    @Override
    public String updataData(crud Crud) {
        crudRepository.save(Crud);
        return "success";
    }

    @Override
    public String deleteData(String id) {
        crudRepository.deleteById(id);
        return "Deleted";
    }

    @Override
    public crud getData(String id) {
        return crudRepository.findById(id).get();
    }

    @Override
    public List<crud> getAllData() {
        return crudRepository.findAll();
    }
}
