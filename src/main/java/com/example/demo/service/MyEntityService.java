package com.example.demo.service;

import com.example.demo.model.MyMainEntity;
import com.example.demo.persistence.MyEnityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyEntityService {
    private final MyEnityRepository myEnityRepository;

    public MyEntityService(MyEnityRepository myEnityRepository) {
        this.myEnityRepository = myEnityRepository;
    }

    public List<MyMainEntity> getAll(){
        return myEnityRepository.findAll();
    }

    public void create(MyMainEntity entity){
        myEnityRepository.save(entity);
    }
}
