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
public class Bloodhunt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String cities; //Bloodhunt called for the character in this cities
    private int characterId;
    private int redlist; //Bloodhunt called by redlist or not 1 is was 0 is not

    public Bloodhunt(){
        id = -1;
        cities= null;
        characterId = -1;
        redlist = -1;
    }

    public Bloodhunt(int id, String cities, int characterId, int redlist){
        this.id = id;
        this.cities= cities;
        this.characterId = characterId;
        this.redlist = redlist;
    }
}
