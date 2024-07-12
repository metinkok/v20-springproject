package com.example.v20.repositories;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.example.v20.entities.Characters;

@Repository
public interface CharacterRepository extends CrudRepository<Characters, Integer>{
    
    @Query(value = "SELECT * FROM CHARACTERS WHERE ID = :id", nativeQuery = true)
    Characters getById(@Param("id") int id);

    @Query(value = "SELECT * FROM CHARACTERS WHERE NPC = :npc", nativeQuery = true)
    List<Characters> getNpcPc(@Param("npc") int npc);

    @Transactional@Modifying
    @Query(value = "INSERT INTO CHARACTERS (name, clan, concept, demeanor, generation, npc, backstory) VALUES (:name, :clan, :concept, :demeanor, :generation, :npc, :backstory)", nativeQuery = true)
    void insertCharacter(@Param("name") String name, @Param("clan") String clan, @Param("concept") String concept,@Param("demeanor") String demeanor,
    @Param("generation") int generation, @Param("npc") int npc, @Param("backstory") String backstory);
}
