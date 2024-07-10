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
public class Messages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String message;
    private int characterId;

    public Messages(){
        id = -1;
        message = null;
        characterId = -1;
    }
    public Messages(int id, String message, int characterId){
        this.id = id;
        this.message = message;
        this.characterId = characterId;
    }
    public Messages(String message, int characterId){
        id = -1;
        this.message = message;
        this.characterId = characterId;
    }
}
