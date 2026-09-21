package com.fintech.repository;

import com.fintech.model.ProductoFinanciero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoFinancieroRepository extends JpaRepository<ProductoFinanciero, Long> {
}