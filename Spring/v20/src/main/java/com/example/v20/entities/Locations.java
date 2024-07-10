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
public class Locations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;

    public Locations(){
        id = -1;
        name = null;
        address = null;
    }

    public Locations(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
