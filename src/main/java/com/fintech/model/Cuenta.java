package com.fintech.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numeroCuenta;
    private double saldo;
    @ManyToOne
    private Cliente cliente;
    @OneToMany(mappedBy = "cuenta")
    private List<Transaccion> transacciones;
    // Getters and setters
}