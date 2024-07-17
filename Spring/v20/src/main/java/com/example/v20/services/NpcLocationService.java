package com.example.v20.services;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.v20.entities.NpcLocation;
import com.example.v20.repositories.NpcLocationRepository;

@Service
public class NpcLocationService {
    @Autowired
    private NpcLocationRepository repository;

    //Lists all Npc-Locations
    public List<NpcLocation> all(){
        List<NpcLocation> list = new ArrayList<>();
        repository.findAll().forEach(list::add);
        return list;
    }

    //Gets Npc-Location with given id
    public NpcLocation getById(int id){
        return repository.getById(id);
    }

    //Can be used to list locations npc can propably in
    public List<NpcLocation> getByNpc(int characterId){
        List<NpcLocation> list = new ArrayList<>();
        repository.getNpc(characterId).forEach(list::add);
        return list;
    }

    //Can be used to list npcs can propably in given location
    public List<NpcLocation> getByLocation(int locationId){
        List<NpcLocation> list = new ArrayList<>();
        repository.getLocation(locationId).forEach(list::add);
        return list;
    }

    //Inserts new npc location
    public boolean insertNpcLocation(NpcLocation npcLocation){
        repository.insertNpcLocation(npcLocation.getCharacterId(), npcLocation.getLocationId());
        return true;
    }
}