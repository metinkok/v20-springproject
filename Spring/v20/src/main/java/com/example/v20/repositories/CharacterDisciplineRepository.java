package com.example.v20.repositories;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.example.v20.entities.CharacterDiscipline;

@Repository
public interface CharacterDisciplineRepository extends CrudRepository<CharacterDiscipline, Integer>{

    @Query(value = "SELECT * FROM CHARACTERDISCIPLINE WHERE ID = :id", nativeQuery = true)
    CharacterDiscipline getById(@Param("id") int id);
    
    @Query(value = "SELECT * FROM CHARACTERDISCIPLINE WHERE CHARACTERID = :id", nativeQuery = true)
    List<CharacterDiscipline> getByCharacterId(@Param("id") int id);

    @Query(value = "SELECT * FROM CHARACTERDISCIPLINE WHERE DISCIPLINEID = :id", nativeQuery = true)
    List<CharacterDiscipline> getByDisciplineId(@Param("id") int id);

    @Transactional@Modifying
    @Query(value = "INSERT INTO CHARACTERDISCIPLINE (characterId, disciplineId, points) VALUES (:characterId, :disciplineId, :points)", nativeQuery = true)
    void insertCharacterDiscipline(@Param("characterId") int characterId, @Param("disciplineId") int disciplineId, @Param("points") int points);
}
