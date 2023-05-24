package com.example.demo.persistence;

import com.example.demo.model.MyMainEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface MyEnityRepository extends CrudRepository<MyMainEntity, String>, JpaRepository<MyMainEntity, String> {
}
