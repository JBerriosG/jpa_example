package com.jpa.services;

import com.jpa.entities.MonsterEntity;
import com.jpa.repositories.MonsterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonsterService {

    @Autowired
    private MonsterRepository repository;

    public List<MonsterEntity> getAllMonsters(){
        return this.repository.findAll();
    }

    public MonsterEntity saveAndUpdateMonster(MonsterEntity monster){
        return this.repository.save(monster);
    }

    public String deleteMonster(MonsterEntity monster){
        this.repository.delete(monster);
        return "Monster was deleted succeeded";
    }

    public List<MonsterEntity> getAllMonstersByType(String type){
        return this.repository.findByType(type);
    }

    public List<MonsterEntity> getAllMonsterByOrigin(String origin){
        return this.repository.findByOrigin(origin);
    }
}
