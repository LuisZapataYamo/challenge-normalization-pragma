package com.fintech.service;

import com.fintech.model.Transaccion;
import com.fintech.repository.TransaccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransaccionService {
    @Autowired
    private TransaccionRepository transaccionRepository;

    public List<Transaccion> getAllTransacciones() {
        return transaccionRepository.findAll();
    }

    public Transaccion getTransaccionById(Long id) {
        return transaccionRepository.findById(id).orElse(null);
    }

    public Transaccion saveTransaccion(Transaccion transaccion) {
        return transaccionRepository.save(transaccion);
    }

    public void deleteTransaccion(Long id) {
        transaccionRepository.deleteById(id);
    }
}