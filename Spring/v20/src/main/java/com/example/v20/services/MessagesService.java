package com.example.v20.services;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.v20.entities.Messages;
import com.example.v20.repositories.MessagesRepository;

@Service
public class MessagesService {
    @Autowired
    private MessagesRepository repository;

    //Lists all Messages
    public List<Messages> all(){
        List<Messages> list = new ArrayList<>();
        repository.findAll().forEach(list::add);
        return list;
    }

    //Gets Message with given id
    public Messages getById(int id){
        return repository.getById(id);
    }

    //Lists messages for given character
    public List<Messages> getByCharacter(int characterId){
        List<Messages> list = new ArrayList<>();
        repository.getCharacter(characterId).forEach(list::add);
        return list;
    }

    //Inserts new message
    public boolean insertMessge(Messages message){
        repository.insertMessage(message.getMessage(), message.getCharacterId());
        return true;
    }
}
