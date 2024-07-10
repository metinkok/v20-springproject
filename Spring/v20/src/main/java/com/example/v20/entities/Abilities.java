package com.example.v20.entities;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Abilities {
    
    private int id;
    private int alertness;
    private int athletics;
    private int awareness;
    private int brawl;
    private int empathy;
    private int expression;
    private int intimidation;

    private int leadership;
    private int streetwise;
    private int subterfuge;
    private int animalken;
    private int craft;
    private int drive;
    private int etiquette;

    private int firearms;
    private int larceny;
    private int melee;
    private int performance;
    private int stealth;
    private int survival;
    private int academics;

    private int computer;
    private int finance;
    private int investigation;
    private int law;
    private int medicine;
    private int occult;
    private int politics;
    private int science;
    private int technology;

    public Abilities(){
        id = -1;
        alertness = -1;
        athletics = -1;
        awareness = -1;
        brawl = -1;
        empathy = -1;
        expression = -1;
        intimidation = -1;

        leadership = -1;
        streetwise = -1;
        subterfuge = -1;
        animalken = -1;
        craft = -1;
        drive = -1;
        etiquette = -1;

        firearms = -1;
        larceny = -1;
        melee = -1;
        performance = -1;
        stealth = -1;
        survival = -1;
        academics = -1;

        computer = -1;
        finance = -1;
        investigation = -1;
        law = -1;
        medicine = -1;
        occult = -1;
        politics = -1;
        science = -1;
        technology = -1;
    }
    public Abilities(int id, int alertness, int athletics, int awareness, int brawl, int empathy, int expression, int intimidation, 
    int leadership, int streetwise, int subterfuge, int animalken, int craft, int drive, int etiquette,
    int firearms, int larceny, int melee, int performance, int stealth, int survival, int academics,
    int computer, int finance, int investigation, int law, int medicine, int occult, int politics, int science, int technology){
        this.id = id;
        this.alertness = alertness;
        this.athletics = athletics;
        this.awareness = awareness;
        this.brawl = brawl;
        this.empathy = empathy;
        this.expression = expression;
        this.intimidation = intimidation;

        this.leadership = leadership;
        this.streetwise = streetwise;
        this.subterfuge = subterfuge;
        this.animalken = animalken;
        this.craft = craft;
        this.drive = drive;
        this.etiquette = etiquette;

        this.firearms = firearms;
        this.larceny = larceny;
        this.melee = melee;
        this.performance = performance;
        this.stealth = stealth;
        this.survival = survival;
        this.academics = academics;

        this.computer = computer;
        this.finance = finance;
        this.investigation = investigation;
        this.law = law;
        this.medicine = medicine;
        this.occult = occult;
        this.politics = politics;
        this.science = science;
        this.technology = technology;
    }
}
