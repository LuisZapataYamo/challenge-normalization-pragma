package com.fintech.model;

import jakarta.persistence.*;

@Entity
public class Transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double monto;
    private String descripcion;
    @ManyToOne
    private Cuenta cuenta;
    // Getters and setters
}