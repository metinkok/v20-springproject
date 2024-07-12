package com.example.v20.repositories;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.v20.entities.Attributes;

@Repository
public interface AttributesRepository extends CrudRepository<Attributes, Integer>{
    
    @Query(value = "SELECT * FROM ATTRIBUTES WHERE ID = :id", nativeQuery = true)
    Attributes getById(@Param("id") int id);
    
    @Transactional@Modifying
    @Query(value = "INSERT INTO ATTRIBUTES (id, strength, dexterity, stamina, charisma, manipulation, apperance, perception, intelligence, wits,"+
    "VALUES (:id, :strength, :dexterity, :stamina, :charisma, :manipulation, :apperance, :perception, :intelligence, :wits)", nativeQuery = true)
    void insertAttribute(@Param("id") int id, @Param("strength") int strength, @Param("dexterity") int dexterity, @Param("stamina") int stamina, @Param("charisma") int charisma, 
    @Param("manipulation") int manipulation, @Param("apperance") int apperance, @Param("perception") int perception, @Param("intelligence") int intelligence, @Param("wits") int wits);

    @Transactional@Modifying
    @Query(value = "UPDATE ATTRIBUTES SET strength = :strength, dexterity = :dexterity, stamina = :stamina, charisma = :charisma, manipulation = :manipulation, apperance = :apperance,"+
    "perception = :perception, intelligence = :intelligence, wits = :wits,"+
    " WHERE ID = :id", nativeQuery = true)
    void updateAttribute(@Param("id") int id, @Param("strength") int strength, @Param("dexterity") int dexterity, @Param("stamina") int stamina, @Param("charisma") int charisma, 
    @Param("manipulation") int manipulation, @Param("apperance") int apperance, @Param("perception") int perception, @Param("intelligence") int intelligence, @Param("wits") int wits);

    @Modifying
    @Query(value = "DELETE FROM ATTRIBUTES WHERE ID = :id", nativeQuery = true)
    void deleteAttribute(@Param("id") int id);
}