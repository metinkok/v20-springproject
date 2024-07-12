package com.example.v20.repositories;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.v20.entities.Abilities;

@Repository
public interface AbilitiesRepository extends CrudRepository<Abilities, Integer>{
    
    @Query(value = "SELECT * FROM ABILITIES WHERE ID = :id", nativeQuery = true)
    Abilities getById(@Param("id") int id);

    @Transactional@Modifying
    @Query(value = "INSERT INTO ABILITIES (id, alertness, athletics, awareness, brawl, empathy, expression, intimidation, leadership, streetwise,"+
    "subterfuge, animalken, craft, drive, etiquette, firearms, larceny, melee, performance, stealth, survival, academics, computer, finance, investigation, law, "+
    "medicine, occult, politics, science, technology) VALUES (:id, :alertness, :athletics, :awareness, :brawl, :empathy, :expression, :intimidation, :leadership, :streetwise, "+
    ":subterfuge, :animalken, :craft, :drive, :etiquette, :firearms, :larceny, :melee, :performance, :stealth, :survival, :academics, :computer, :finance, :investigation, :law, "+
    ":medicine, :occult, :politics, :science, :technology)", nativeQuery = true)
    void insertAbility(@Param("id") int id, @Param("alertness") int alertness, @Param("athletics") int athletics, @Param("awareness") int awareness, @Param("brawl") int brawl, 
    @Param("empathy") int empathy, @Param("expression") int expression, @Param("intimidation") int intimidation, @Param("leadership") int leadership, @Param("streetwise") int streetwise,
    @Param("subterfuge") int subterfuge, @Param("animalken") int animalken, @Param("craft") int craft, @Param("drive") int drive, @Param("etiquette") int etiquette,
    @Param("firearms") int firearms, @Param("larceny") int larceny, @Param("melee") int melee, @Param("performance") int performance, @Param("stealth") int stealth, @Param("survival") int survival,
    @Param("academics") int academics, @Param("computer") int computer, @Param("finance") int finance, @Param("investigation") int investigation, @Param("law") int law,
    @Param("medicine") int medicine, @Param("occult") int occult, @Param("politics") int politics, @Param("science") int science, @Param("technology") int technology);

    @Transactional@Modifying
    @Query(value = "UPDATE ABILITIES SET alertness = :alertness, athletics = :athletics, awareness = :awareness, brawl = :brawl, empathy = :empathy, expression = :expression, intimidation = :intimidation, leadership = :leadership, streetwise = :streetwise,"+
    "subterfuge = :subterfuge, animalken = :animalken, craft = :craft, drive = :drive, etiquette = :etiquette, firearms = :firearms, larceny = :larceny, melee = :melee, performance = :performance, "+
    "stealth = :stealth, survival = :survival, academics = :academics, computer = :computer, finance = :finance, investigation = :investigation, law = :law, medicine = :medicine, "+
    "occult = :occult, politics = :politics, science = :science, technology = :technology WHERE ID = :id", nativeQuery = true)
    void updateAbility(@Param("id") int id, @Param("alertness") int alertness, @Param("athletics") int athletics, @Param("awareness") int awareness, @Param("brawl") int brawl, 
    @Param("empathy") int empathy, @Param("expression") int expression, @Param("intimidation") int intimidation, @Param("leadership") int leadership, @Param("streetwise") int streetwise,
    @Param("subterfuge") int subterfuge, @Param("animalken") int animalken, @Param("craft") int craft, @Param("drive") int drive, @Param("etiquette") int etiquette,
    @Param("firearms") int firearms, @Param("larceny") int larceny, @Param("melee") int melee, @Param("performance") int performance, @Param("stealth") int stealth, @Param("survival") int survival,
    @Param("academics") int academics, @Param("computer") int computer, @Param("finance") int finance, @Param("investigation") int investigation, @Param("law") int law,
    @Param("medicine") int medicine, @Param("occult") int occult, @Param("politics") int politics, @Param("science") int science, @Param("technology") int technology);

    @Modifying
    @Query(value = "DELETE FROM ABILITIES WHERE ID = :id", nativeQuery = true)
    void deleteAbility(@Param("id") int id);
}
