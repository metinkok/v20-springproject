package com.example.v20.repositories;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.v20.entities.Posts;

@Repository
public interface PostsRepository extends CrudRepository<Posts, Integer>{
    
    @Query(value = "SELECT * FROM POSTS WHERE ID = :id", nativeQuery = true)
    Posts getById(@Param("id") int id);

    @Transactional@Modifying
    @Query(value = "INSERT INTO POSTS (title, post) VALUES (:title, :post)", nativeQuery = true)
    void insertBloodhunt(@Param("title") String title, @Param("post") String post);
}
