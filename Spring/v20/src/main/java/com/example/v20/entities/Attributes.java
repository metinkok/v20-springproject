package com.example.v20.entities;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Attributes {

    private int id;
    private int strength;
    private int dexterity;
    private int stamina;
    private int charisma;
    private int manipulation;
    private int apperance;
    private int perception;
    private int intelligence;
    private int wits;

    public Attributes(){
        id = -1;
        strength = -1;
        dexterity = -1;
        stamina = -1;
        charisma = -1;
        manipulation = -1;
        apperance = -1;
        perception = -1;
        intelligence = -1;
        wits = -1;
    }
    public Attributes(int id, int strength, int dexterity, int stamina, int charisma, int manipulation, int apperance, int perception, int intelligence, int wits){
        this.id = id;
        this.strength = strength;
        this.dexterity = dexterity;
        this.stamina = stamina;
        this.charisma = charisma;
        this.manipulation = manipulation;
        this.apperance = apperance;
        this.perception = perception;
        this.intelligence = intelligence;
        this.wits = wits;
    }
}
