package com.fintech.service;

import com.fintech.model.ProductoFinanciero;
import com.fintech.repository.ProductoFinancieroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoFinancieroService {
    @Autowired
    private ProductoFinancieroRepository productoFinancieroRepository;

    public List<ProductoFinanciero> getAllProductosFinancieros() {
        return productoFinancieroRepository.findAll();
    }

    public ProductoFinanciero getProductoFinancieroById(Long id) {
        return productoFinancieroRepository.findById(id).orElse(null);
    }

    public ProductoFinanciero saveProductoFinanciero(ProductoFinanciero productoFinanciero) {
        return productoFinancieroRepository.save(productoFinanciero);
    }

    public void deleteProductoFinanciero(Long id) {
        productoFinancieroRepository.deleteById(id);
    }
}