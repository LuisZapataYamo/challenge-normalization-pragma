package com.pragma.domain.service;

import com.pragma.data.model.Entity;
import com.pragma.infrastructure.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {

    private final DataRepository dataRepository;

    @Autowired
    public DataService(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public List<Entity> getAllEntities() {
        return dataRepository.findAll();
    }

    public Entity getEntityById(Long id) {
        return dataRepository.findById(id).orElse(null);
    }

    public Entity saveEntity(Entity entity) {
        return dataRepository.save(entity);
    }

    public void deleteEntity(Long id) {
        dataRepository.deleteById(id);
    }
}