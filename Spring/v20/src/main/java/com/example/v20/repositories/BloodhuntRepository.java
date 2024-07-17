package com.example.v20.repositories;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.example.v20.entities.Bloodhunt;

@Repository
public interface BloodhuntRepository extends CrudRepository<Bloodhunt, Integer>{
    
    @Query(value = "SELECT * FROM BLOODHUNT WHERE ID = :id", nativeQuery = true)
    Bloodhunt getById(@Param("id") int id);

    @Query(value = "SELECT * FROM BLOODHUNT WHERE CITIES LIKE %:city%", nativeQuery = true)
    List<Bloodhunt> getByCity(@Param("city") String city);

    @Query(value = "SELECT * FROM BLOODHUNT WHERE CHARACTERID = :characterId", nativeQuery = true)
    List<Bloodhunt> getByCharacter(@Param("characterId") int characterId);

    @Query(value = "SELECT * FROM BLOODHUNT WHERE REDLIST = 1", nativeQuery = true)
    List<Bloodhunt> getRedlist();

    @Transactional@Modifying
    @Query(value = "INSERT INTO BLOODHUNT (cities, characterId, redlist) VALUES (:cities, :characterId, :redlist)", nativeQuery = true)
    void insertBloodhunt(@Param("cities") String cities, @Param("characterId") int characterId, @Param("redlist") int redlist);

    @Transactional@Modifying
    @Query(value = "UPDATE BLOODHUNT SET CITIES = :cities WHERE CHARACTERID = :characterId)", nativeQuery = true)
    void updateCities(@Param("cities") String cities, @Param("characterId") int characterId);

    @Transactional@Modifying
    @Query(value = "UPDATE BLOODHUNT SET REDLIST = :redlist WHERE CHARACTERID = :characterId)", nativeQuery = true)
    void updateRedList(@Param("redlist") int redlist, @Param("characterId") int characterId);

    @Modifying
    @Query(value = "DELETE FROM BLOODHUNT WHERE ID = :id", nativeQuery = true)
    void deleteBloodhunt(@Param("id") int id);
}
