package com.example.v20.services;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.v20.entities.Users;
import com.example.v20.repositories.UsersRepository;

@Service
public class UsersService {
    @Autowired
    private UsersRepository repository;

    //Lists all users
    public List<Users> all(){
        List<Users> list = new ArrayList<>();
        repository.findAll().forEach(list::add);
        return list;
    }

    //Gets user with given id
    public Users getById(int id){
        return repository.getById(id);
    }

    public List<Users> getStoryTellers(){
        List<Users> list = new ArrayList<>();
        repository.findStoryTeller().forEach(list::add);
        return list;
    }

    //Lists all admin users
    public List<Users> getAdmins(){
        List<Users> list = new ArrayList<>();
        repository.getAdmin(1).forEach(list::add);
        return list;
    }

    //Lists all on-admin users
    public List<Users> getNonAdmins(){
        List<Users> list = new ArrayList<>();
        repository.getAdmin(0).forEach(list::add);
        return list;
    }

    //Lists users with username contains given username
    public List<Users> search(String name){
        List<Users> list = new ArrayList<>();
        repository.searchLike(name).forEach(list::add);
        return list;
    }

    //Gets user with given email
    public Users getByMail(String email){
        return repository.getByMail(email);
    }

    //Inserts new user
    public boolean insertUser(Users user){
        repository.insertUser(user.getName(), user.getE_mail(), user.getPassword());
        return true;
    }

    //Sets given users password to given password
    public boolean updatePassword(String password, int id){
        repository.changePassword(password, id);
        return true;
    }

    //Sets given users admin status to given admin variable
    public boolean updateAdmin(int admin, int id){
        repository.updateAdmin(admin, id);
        return true;
    }

    //Sets given users storyteller status to given storyteller variable
    public boolean updateStoryteller(int storyteller, int id){
        repository.updateStoryteller(id, storyteller);
        return true;
    }
}