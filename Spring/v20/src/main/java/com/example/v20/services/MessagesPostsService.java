package com.example.v20.services;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.v20.entities.MessagesPosts;
import com.example.v20.repositories.MessagesPostsRepository;

@Service
public class MessagesPostsService {
    @Autowired
    private MessagesPostsRepository repository;

    //Lists all Messages-Posts
    public List<MessagesPosts> all(){
        List<MessagesPosts> list = new ArrayList<>();
        repository.findAll().forEach(list::add);
        return list;
    }

    //Gets Messages-Post with given id
    public MessagesPosts getById(int id){
        return repository.getById(id);
    }

    //Gets Messages-Post with given post id for getting message ids
    public List<MessagesPosts> getByPost(int id){
        List<MessagesPosts> list = new ArrayList<>();
        repository.getPost(id).forEach(list::add);
        return list;
    }

    //Inserts new Messages-Post
    public boolean insertMessagePost(MessagesPosts messagesPost){
        repository.insertMessagePost(messagesPost.getMessageId(), messagesPost.getPostId());
        return true;
    }
}
