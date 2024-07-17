package com.example.v20.repositories;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.example.v20.entities.NpcLocation;

@Repository
public interface NpcLocationRepository extends CrudRepository<NpcLocation, Integer>{
    
    @Query(value = "SELECT * FROM NPCLOCATION WHERE ID = :id", nativeQuery = true)
    NpcLocation getById(@Param("id") int id);

    @Query(value = "SELECT * FROM NPCLOCATION WHERE CHARACTERID = :characterId", nativeQuery = true)
    List<NpcLocation> getNpc(@Param("characterId") int characterId);

    @Query(value = "SELECT * FROM NPCLOCATION WHERE LOCATIONID = :locationId", nativeQuery = true)
    List<NpcLocation> getLocation(@Param("locationId") int locationId);

    @Transactional@Modifying
    @Query(value = "INSERT INTO NPCLOCATION (characterId, locationId) VALUES (:characterId, :locationId)", nativeQuery = true)
    void insertNpcLocation(@Param("characterId") int characterId, @Param("locationId") int locationId);
}
