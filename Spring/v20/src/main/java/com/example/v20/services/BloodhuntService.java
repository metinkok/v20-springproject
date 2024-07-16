package com.example.v20.services;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.v20.entities.Bloodhunt;
import com.example.v20.repositories.BloodhuntRepository;

@Service
public class BloodhuntService {
    @Autowired
    private BloodhuntRepository repository;
    
    //Lists all bloodhunts
    public List<Bloodhunt> all(){
        List<Bloodhunt> list = new ArrayList<>();
        repository.findAll().forEach(list::add);
        return list;
    }

    //Gets bloodhunt with given id
    public Bloodhunt getById(int id){
        return repository.getById(id);
    }

    //Gets bloodhunt in given city
    public List<Bloodhunt> getByCity(String city){
        List<Bloodhunt> list = new ArrayList<>();
        repository.getByCity(city).forEach(list::add);
        return list;
    }

    //Gets bloodhunt for given character
    public List<Bloodhunt> getByCharacter(int characterId){
        List<Bloodhunt> list = new ArrayList<>();
        repository.getByCharacter(characterId).forEach(list::add);
        return list;
    }

    //Returns redlist
    public List<Bloodhunt> getRedList(){
        List<Bloodhunt> list = new ArrayList<>();
        repository.getRedlist().forEach(list::add);
        return list;
    }

    //Starts a new bloodhunt
    public boolean insertBloodhunt(Bloodhunt bloodhunt){
        repository.insertBloodhunt(bloodhunt.getCities(), bloodhunt.getCharacterId(), bloodhunt.getRedlist());
        return true;
    }

    //Updates active bloodhunts for given character and sets active cities given cities
    public boolean updateCities(String cities, int characterId){
        repository.updateCities(cities, characterId);
        return true;
    }

    //Adds character to the redlist
    public boolean addToRedList(int characterId){
        repository.updateRedList(1, characterId);
        return true;
    }

    //Removes character from redlist
    public boolean removeFromRedList(int characterId){
        repository.updateRedList(0, characterId);
        return true;
    }

    //Deletes bloodhunt
    public boolean deleteBloodhunt(int id){
        repository.deleteBloodhunt(id);
        return true;
    }
}
