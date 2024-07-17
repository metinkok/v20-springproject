package com.example.v20.services;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.v20.entities.Locations;
import com.example.v20.repositories.LocationsRepository;

@Service
public class LocationService {
    @Autowired
    private LocationsRepository repository;

    //Lists all locations
    public List<Locations> all(){
        List<Locations> list = new ArrayList<>();
        repository.findAll().forEach(list::add);
        return list;
    }

    //Gets location with given id
    public Locations getById(int id){
        return repository.getById(id);
    }

    //Gets location with given name
    public Locations getByName(String name){
        return repository.getByName(name);
    }

    //Inserts new location
    public boolean insertLocation(Locations location){
        repository.insertLocation(location.getName(), location.getAddress());
        return true;
    }

    //Deleteslocation propably after destroyed
    public boolean deleteLocation(int id){
        repository.deleteLocation(id);
        return true;
    }
}
