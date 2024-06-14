package com.Restapi.CRUD.Service;

import com.Restapi.CRUD.crud;

import java.util.List;

public interface crudService {

    public String createData(crud Crud);
    public String updataData(crud Crud);
    public String deleteData(String id);
    public crud getData(String id);

    public List<crud>getAllData();
}
