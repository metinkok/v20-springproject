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
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String post;
    
    public Posts(){
        id = -1;
        title = null;
        post = null;
    }

    public Posts(int id, String title, String post){
        this.id = id;
        this.title = title;
        this.post = post;
    }
}
