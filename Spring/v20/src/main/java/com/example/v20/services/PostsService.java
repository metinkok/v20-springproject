package com.example.v20.services;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.v20.entities.Posts;
import com.example.v20.repositories.PostsRepository;

@Service
public class PostsService {
    @Autowired
    private PostsRepository repository;

    //Lists all posts
    public List<Posts> all(){
        List<Posts> list = new ArrayList<>();
        repository.findAll().forEach(list::add);
        return list;
    }

    //Gets post with given id
    public Posts getById(int id){
        return repository.getById(id);
    }

    //Inserts new post to schreknet
    public boolean insertPost(Posts post){
        repository.insertPost(post.getTitle(), post.getPost());
        return true;
    }
}
