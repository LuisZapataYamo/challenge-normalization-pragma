package com.fintech.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ProductoFinanciero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private double tasaInteres;
}
