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
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String e_mail;
    private String password;
    private int admn;// 1 admin 0 not
    private int storyteller;// 1 story teller 0 not

    public Users() {
        id = -1;
        name = null;
        e_mail = null;
        password = null;
        admn = -1;
        storyteller = -1;
    }

    public Users(int id, String name, String e_mail, String password, int point, int admn, int storyteller) {
        this.id = id;
        this.name = name;
        this.e_mail = e_mail;
        this.password = password;
        this.admn = admn;
        this.storyteller = storyteller;
    }

    public Users(String name, String e_posta, String password) {
        id = -1;
        this.name = name;
        this.e_mail = e_posta;
        this.password = password;
        admn = -1;
        storyteller = -1;
    }

    public Users(int id) {
        this.id = id;
        name = null;
        e_mail = null;
        password = null;
        admn = -1;
        storyteller = -1;
    }
}
