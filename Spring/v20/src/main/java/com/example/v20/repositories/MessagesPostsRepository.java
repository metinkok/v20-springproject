package com.example.v20.repositories;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.example.v20.entities.MessagesPosts;

@Repository
public interface MessagesPostsRepository extends CrudRepository<MessagesPosts, Integer>{
    
    @Query(value = "SELECT * FROM MESSAGES_POSTS WHERE ID = :id", nativeQuery = true)
    MessagesPosts getById(@Param("id") int id);

    @Query(value = "SELECT * FROM MESSAGES_POSTS WHERE POSTID = :postId", nativeQuery = true)
    List<MessagesPosts> getPost(@Param("postId") int postId);

    @Transactional@Modifying
    @Query(value = "INSERT INTO MESSAGES_POSTS (messageId, postId) VALUES (:messageId, :postId)", nativeQuery = true)
    void insertMessagePost(@Param("messageId") int messageId, @Param("postId") int postId);
}
