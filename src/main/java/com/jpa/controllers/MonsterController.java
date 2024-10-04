package com.jpa.controllers;

import com.jpa.entities.MonsterEntity;
import com.jpa.services.MonsterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MonsterController {

    @Autowired
    private MonsterService service;

    @GetMapping("/monsters")
    public List<MonsterEntity> getAllMonsters(){
        return this.service.getAllMonsters();
    }

    @PostMapping("/monster")
    public MonsterEntity saveAndUpdateMonster(@RequestBody MonsterEntity monster){
        return this.service.saveAndUpdateMonster(monster);
    }

    @DeleteMapping("/monster")
    public String deleteMonster(@RequestBody MonsterEntity monster){
        return this.service.deleteMonster(monster);
    }

    @GetMapping("/monsters/type/{type}")
    public List<MonsterEntity> getAllMonstersByType(@PathVariable String type){
        return this.service.getAllMonstersByType(type);
    }

    @GetMapping("/monsters/origin/{origin}")
    public List<MonsterEntity> getAllMonsterByOrigin(@PathVariable String origin){
        return this.service.getAllMonsterByOrigin(origin);
    }
}
