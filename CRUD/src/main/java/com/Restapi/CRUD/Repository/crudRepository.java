package com.Restapi.CRUD.Repository;

import com.Restapi.CRUD.crud;
import org.springframework.data.jpa.repository.JpaRepository;

public interface crudRepository extends JpaRepository<crud, String> {
}
