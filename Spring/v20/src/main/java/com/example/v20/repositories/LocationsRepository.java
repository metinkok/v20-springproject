package com.example.v20.repositories;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.v20.entities.Disciplines;
import com.example.v20.entities.Locations;

@Repository
public interface LocationsRepository extends CrudRepository<Locations, Integer>{
    
    @Query(value = "SELECT * FROM LOCATIONS WHERE ID = :id", nativeQuery = true)
    Locations getById(@Param("id") int id);

    @Query(value = "SELECT * FROM LOCATIONS WHERE NAME LIKE %:name%", nativeQuery = true)
    Disciplines getByName(@Param("name") String name);

    @Transactional@Modifying
    @Query(value = "INSERT INTO LOCATIONS (name, address) VALUES (:name, :address)", nativeQuery = true)
    void insertLocation(@Param("name") String name, @Param("address") String address);

    @Modifying
    @Query(value = "DELETE FROM LOCATIONS WHERE ID = :id", nativeQuery = true)
    void deleteLocation(@Param("id") int id);
}