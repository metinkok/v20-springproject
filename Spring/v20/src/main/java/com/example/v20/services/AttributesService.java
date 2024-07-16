package com.example.v20.services;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.v20.entities.Attributes;
import com.example.v20.repositories.AttributesRepository;

@Service
public class AttributesService {
    @Autowired
    private AttributesRepository repository;
    
    //Lists all attributes
    public List<Attributes> all(){
        List<Attributes> list = new ArrayList<>();
        repository.findAll().forEach(list::add);
        return list;
    }

    //Lists attributes of character with given id
    public Attributes getById(int id){
        return repository.getById(id);
    }
    
    //Inserts new attributes
    public boolean insertAttribute(Attributes attribute){
        repository.insertAttribute(attribute.getId(), attribute.getStrength(), attribute.getDexterity(), attribute.getStamina(),
        attribute.getCharisma(), attribute.getManipulation(), attribute.getApperance(), attribute.getPerception(), attribute.getIntelligence(),
        attribute.getWits());
        return true;
    }

    //Updates attributes propably after session
    public boolean updateAttribute(Attributes attribute){
        repository.updateAttribute(attribute.getId(), attribute.getStrength(), attribute.getDexterity(), attribute.getStamina(),
        attribute.getCharisma(), attribute.getManipulation(), attribute.getApperance(), attribute.getPerception(), attribute.getIntelligence(),
        attribute.getWits());
        return true;
    }

    //Deletes attribute before deleting character
    public boolean deleteAttribute(int id){
        repository.deleteAttribute(id);
        return true;
    }
}
