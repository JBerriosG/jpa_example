package com.jpa.repositories;

import com.jpa.entities.MonsterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MonsterRepository extends JpaRepository<MonsterEntity, Long> {

    List<MonsterEntity> findByType(String type);
    List<MonsterEntity> findByOrigin(String origin);
}
