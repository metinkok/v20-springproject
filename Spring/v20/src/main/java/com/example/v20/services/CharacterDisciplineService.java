package com.example.v20.services;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.v20.entities.CharacterDiscipline;
import com.example.v20.repositories.CharacterDisciplineRepository;

@Service
public class CharacterDisciplineService {
    @Autowired
    private CharacterDisciplineRepository repository;

    //Lists all character-disciplines
    public List<CharacterDiscipline> all(){
        List<CharacterDiscipline> list = new ArrayList<>();
        repository.findAll().forEach(list::add);
        return list;
    }

    //Gets character-discipline with given id
    public CharacterDiscipline getById(int id){
        return repository.getById(id);
    }

    //Can be used for listing given characters's disciplines
    public List<CharacterDiscipline> getByCharacterId(int characterId){
        return repository.getByCharacterId(characterId);
    }

    //Can be used for listing characters with given discipline
    public List<CharacterDiscipline> getByDisciplineId(int disciplineId){
        List<CharacterDiscipline> list = new ArrayList<>();
        repository.getByDisciplineId(disciplineId).forEach(list::add);
        return list;
    }

    //Inserts new character-discipline
    public boolean insertCharacterDiscipline(CharacterDiscipline characterDiscipline){
        repository.insertCharacterDiscipline(characterDiscipline.getCharacterId(), characterDiscipline.getDisciplineId(), characterDiscipline.getPoints());
        return true;
    }

    //Deletes given characters character discipline connections propably before deleting character
    public boolean deleteCharacterDiscipline(int characterId){
        repository.deleteCharacterDiscipline(characterId);
        return true;
    }
}