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
public class Characters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String clan;
    private String concept;
    private String demeanor;
    private int generation;
    private int npc;
    private String backstory;

    public Characters(){
        id = -1;
        name = null;
        clan = null;
        concept = null;
        demeanor = null;
        generation = -1;
        npc = -1;
        backstory = null;
    }

    public Characters(int id, String name, String clan, String concept, String demeanor, int generation, int npc, String backstory){
        this.id = id;
        this.name = name;
        this.clan = clan;
        this.concept = concept;
        this.demeanor = demeanor;
        this.generation = generation;
        this.npc = npc;
        this.backstory = backstory;
    }
}
