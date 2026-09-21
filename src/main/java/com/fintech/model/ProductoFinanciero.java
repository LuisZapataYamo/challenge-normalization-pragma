package com.fintech.model;

import jakarta.persistence.*;

@Entity
public class ProductoFinanciero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private double tasaInteres;
    // Getters and setters
}