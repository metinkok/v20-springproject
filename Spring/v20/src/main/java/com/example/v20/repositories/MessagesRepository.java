package com.example.v20.repositories;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.example.v20.entities.Messages;

@Repository
public interface MessagesRepository extends CrudRepository<Messages, Integer>{
    
    @Query(value = "SELECT * FROM MESSAGES WHERE ID = :id", nativeQuery = true)
    Messages getById(@Param("id") int id);

    @Query(value = "SELECT * FROM MESSAGES WHERE CHARACTERID = :characterId", nativeQuery = true)
    List<Messages> getCharacter(@Param("characterId") int characterId);

    @Transactional@Modifying
    @Query(value = "INSERT INTO MESSAGES (message, characterId) VALUES (:cities, :characterId)", nativeQuery = true)
    void insertMessge(@Param("message") String message, @Param("characterId") int characterId);
}
