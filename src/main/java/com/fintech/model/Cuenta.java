package com.fintech.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
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
}
