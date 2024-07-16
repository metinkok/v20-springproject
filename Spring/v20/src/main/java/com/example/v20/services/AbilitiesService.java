package com.example.v20.services;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.v20.entities.Abilities;
import com.example.v20.repositories.AbilitiesRepository;

@Service
public class AbilitiesService {
    @Autowired
    private AbilitiesRepository repository;
 
    //Returns list of all abilities
    public List<Abilities> all(){
        List<Abilities> list = new ArrayList<>();
        repository.findAll().forEach(list::add);
        return list;
    }

    //Returns abilities of given character's id
    public Abilities getById(int id){
        return repository.getById(id);
    }

    //Inserts new ability
    public boolean insertAbility(Abilities ability){
        repository.insertAbility(ability.getId(), ability.getAlertness(), ability.getAthletics(), ability.getAwareness(), ability.getBrawl(), ability.getEmpathy(), ability.getExpression(),
        ability.getIntimidation(), ability.getLeadership(), ability.getStreetwise(), ability.getSubterfuge(), ability.getAnimalken(), ability.getCraft(), ability.getDrive(), ability.getEtiquette(),
        ability.getFirearms(), ability.getLarceny(), ability.getMelee(), ability.getPerformance(), ability.getStealth(), ability.getSurvival(), ability.getAcademics(), ability.getComputer(),
        ability.getFinance(), ability.getInvestigation(), ability.getLaw(), ability.getMedicine(), ability.getOccult(), ability.getPolitics(), ability.getScience(), ability.getTechnology());
        return true;
    }
    
    //Updates ability propably after session
    public boolean updateAbility(Abilities ability){
        repository.updateAbility(ability.getId(), ability.getAlertness(), ability.getAthletics(), ability.getAwareness(), ability.getBrawl(), ability.getEmpathy(), ability.getExpression(),
        ability.getIntimidation(), ability.getLeadership(), ability.getStreetwise(), ability.getSubterfuge(), ability.getAnimalken(), ability.getCraft(), ability.getDrive(), ability.getEtiquette(),
        ability.getFirearms(), ability.getLarceny(), ability.getMelee(), ability.getPerformance(), ability.getStealth(), ability.getSurvival(), ability.getAcademics(), ability.getComputer(),
        ability.getFinance(), ability.getInvestigation(), ability.getLaw(), ability.getMedicine(), ability.getOccult(), ability.getPolitics(), ability.getScience(), ability.getTechnology());
        return true;
    }

    //Deletes ability before deleting character
    public boolean deleteAbility(int id){
        repository.deleteAbility(id);
        return true;
    }
}
