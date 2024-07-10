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
public class NpcLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int characterId;
    private int locationId;

    public NpcLocation(){
        id = -1;
        characterId = -1;
        locationId = -1;
    }

    public NpcLocation(int id, int characterId, int locationId){
        this.id = id;
        this.characterId = characterId;
        this.locationId = locationId;
    }
}
