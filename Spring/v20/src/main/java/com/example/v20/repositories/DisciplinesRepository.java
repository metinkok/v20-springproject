package com.example.v20.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.v20.entities.Disciplines;

@Repository
public interface DisciplinesRepository extends CrudRepository<Disciplines, Integer>{
    
    @Query(value = "SELECT * FROM DISCIPLINES WHERE ID = :id", nativeQuery = true)
    Disciplines getById(@Param("id") int id);

    @Query(value = "SELECT * FROM DISCIPLINES WHERE ID = :id", nativeQuery = true)
    Disciplines getByName(@Param("name") String name);
}
