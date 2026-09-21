package com.pragma.infrastructure.repository;

import com.pragma.data.model.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends JpaRepository<Entity, Long> {
}