package com.fintech;

import com.fintech.model.ProductoFinanciero;
import com.fintech.service.ProductoFinancieroService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductoFinancieroServiceTest {
    @Autowired
    private ProductoFinancieroService productoFinancieroService;

    @Test
    void testGetAllProductosFinancieros() {
        assertNotNull(productoFinancieroService.getAllProductosFinancieros());
    }

    @Test
    void testGetProductoFinancieroById() {
        ProductoFinanciero productoFinanciero = productoFinancieroService.getProductoFinancieroById(1L);
        assertNotNull(productoFinanciero);
        assertEquals("Prestamo Personal", productoFinanciero.getNombre());
    }

    @Test
    void testSaveProductoFinanciero() {
        ProductoFinanciero productoFinanciero = new ProductoFinanciero();
        productoFinanciero.setNombre("Tarjeta de Credito");
        productoFinanciero.setTasaInteres(10.0);
        ProductoFinanciero savedProductoFinanciero = productoFinancieroService.saveProductoFinanciero(productoFinanciero);
        assertNotNull(savedProductoFinanciero);
        assertEquals("Tarjeta de Credito", savedProductoFinanciero.getNombre());
    }

    @Test
    void testDeleteProductoFinanciero() {
        productoFinancieroService.deleteProductoFinanciero(1L);
        ProductoFinanciero productoFinanciero = productoFinancieroService.getProductoFinancieroById(1L);
        assertNull(productoFinanciero);
    }
}