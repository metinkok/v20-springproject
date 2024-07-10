package com.example.v20.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class CharacterPosts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int characterId;
    private int postId;

    public CharacterPosts(){
        id = -1;
        characterId = -1;
        postId = -1;
    }

    public CharacterPosts(int id, int characterId, int postId){
        this.id = id;
        this.characterId = characterId;
        this.postId = postId;
    }
}
