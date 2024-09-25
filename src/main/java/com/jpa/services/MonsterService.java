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

    public MonsterEntity saveMonster(MonsterEntity monster){
        return this.repository.save(monster);
    }

    public List<MonsterEntity> getAllMonstersByType(String type){
        return this.repository.findByType(type);
    }

    public List<MonsterEntity> getAllMonsterByOrigin(String origin){
        return this.repository.findByOrigin(origin);
    }
}
