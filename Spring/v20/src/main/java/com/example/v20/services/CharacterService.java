package com.example.v20.services;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.v20.entities.Characters;
import com.example.v20.repositories.CharacterRepository;

@Service
public class CharacterService {
    @Autowired
    private CharacterRepository repository;

    //Lists all characters
    public List<Characters> all(){
        List<Characters> list = new ArrayList<>();
        repository.findAll().forEach(list::add);
        return list;
    }

    //Gets character with given id
    public Characters getById(int id){
        return repository.getById(id);
    }

    //Gets list of all player characters
    public List<Characters> allPC(){
        List<Characters> list = new ArrayList<>();
        repository.getNpcPc(0).forEach(list::add);
        return list;
    }

    //Gets list of all non player characters
    public List<Characters> allNPC(){
        List<Characters> list = new ArrayList<>();
        repository.getNpcPc(1).forEach(list::add);
        return list;
    }

    //Inserts new character
    public boolean insertCharacter(Characters character){
        repository.insertCharacter(character.getName(), character.getClan(), character.getConcept(), character.getDemeanor(), character.getGeneration(), character.getNpc(), character.getBackstory());
        return true;
    }
}
