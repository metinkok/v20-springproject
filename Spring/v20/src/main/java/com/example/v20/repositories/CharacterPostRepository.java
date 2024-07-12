package com.example.v20.repositories;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.example.v20.entities.CharacterPosts;

@Repository
public interface CharacterPostRepository extends CrudRepository<CharacterPosts, Integer>{
    
    @Query(value = "SELECT * FROM CHARACTER_POSTS WHERE ID = :id", nativeQuery = true)
    CharacterPosts getById(@Param("id") int id);
    
    @Query(value = "SELECT * FROM CHARACTER_POSTS WHERE CHARACTERID = :id", nativeQuery = true)
    List<CharacterPosts> getByCharacterId(@Param("id") int id);

    @Query(value = "SELECT * FROM CHARACTER_POSTS WHERE POSTID = :id", nativeQuery = true)
    List<CharacterPosts> getByPostId(@Param("id") int id);

    @Transactional@Modifying
    @Query(value = "INSERT INTO CHARACTER_POSTS (characterId, postId) VALUES (:characterId, :postId)", nativeQuery = true)
    void insertCharacterDiscipline(@Param("characterId") int characterId, @Param("postId") int postId);
}
