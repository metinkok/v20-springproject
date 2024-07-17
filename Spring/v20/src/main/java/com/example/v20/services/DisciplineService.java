package com.example.v20.services;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.v20.entities.Disciplines;
import com.example.v20.repositories.DisciplinesRepository;

@Service
public class DisciplineService {
    @Autowired
    private DisciplinesRepository repository;

    //Lists all disciplines
    public List<Disciplines> all(){
        List<Disciplines> list = new ArrayList<>();
        repository.findAll().forEach(list::add);
        return list;
    }

    //Gets discipline with given id
    public Disciplines getById(int id){
        return repository.getById(id);
    }

    //Gets discipline with given name
    public Disciplines getByName(String name){
        return repository.getByName(name);
    }
}
