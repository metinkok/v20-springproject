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
public class CharacterDiscipline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int characterId;
    private int disciplineId;
    private int points; //dots

    public CharacterDiscipline(){
        id = -1;
        characterId = -1;
        disciplineId = -1;
        points = -1;
    }

    public CharacterDiscipline(int id, int characterId, int disciplineId, int points){
        this.id = id;
        this.characterId = characterId;
        this.disciplineId = disciplineId;
        this.points = points;
    }
}
