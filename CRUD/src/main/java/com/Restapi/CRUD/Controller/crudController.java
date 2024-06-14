package com.Restapi.CRUD.Controller;

import com.Restapi.CRUD.Service.crudService;
import com.Restapi.CRUD.crud;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/crud")
public class crudController {
      crudService crudService;

    public crudController(com.Restapi.CRUD.Service.crudService crudService) {
        this.crudService = crudService;
    }

    @GetMapping("{id}")
   public crud getAllData(@PathVariable("id") String id){
      return  crudService.getData(id);
   }

    @GetMapping()
    public List<crud> getAllData(){
        return  crudService.getAllData();
    }

   @PostMapping("/create")
    public String createData(@RequestBody crud Crud){
            crudService.createData(Crud);
            return "Data created successfully";
   }

   @PutMapping("/update")
   public String updateData(@RequestBody crud Crud){
       crudService.updataData(Crud);
       return "Data updated successfully";
   }

   @DeleteMapping("{id}")
   public String deleteData(@PathVariable("id") String id){
       crudService.deleteData(id);
       return "Data delete successfully";
   }
}
