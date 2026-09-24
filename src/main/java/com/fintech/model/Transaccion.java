package com.fintech.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double monto;
    private String descripcion;
    @ManyToOne
    private Cuenta cuenta;
}
