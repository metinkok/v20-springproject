package com.example.v20.services;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.v20.entities.CharacterPosts;
import com.example.v20.repositories.CharacterPostRepository;

@Service
public class CharacterPostService {
    @Autowired
    private CharacterPostRepository repository;

    //Lists all character-post
    public List<CharacterPosts> all(){
        List<CharacterPosts> list = new ArrayList<>();
        repository.findAll().forEach(list::add);
        return list;
    }

    //Gets character-post with given id
    public CharacterPosts getById(int id){
        return repository.getById(id);
    }

    //Can be used for listing given characters's posts in schreknet
    public List<CharacterPosts> getByCharacterId(int characterId){
        List<CharacterPosts> list = new ArrayList<>();
        repository.getByCharacterId(characterId).forEach(list::add);
        return list;
    }

    //Inserts new character-post
    public boolean insertCharacterPost(CharacterPosts characterPost){
        repository.insertCharacterPost(characterPost.getCharacterId(), characterPost.getPostId());
        return true;
    }
}
