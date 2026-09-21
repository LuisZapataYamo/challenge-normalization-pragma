package com.fintech;

import com.fintech.model.Transaccion;
import com.fintech.service.TransaccionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TransaccionServiceTest {
    @Autowired
    private TransaccionService transaccionService;

    @Test
    void testGetAllTransacciones() {
        assertNotNull(transaccionService.getAllTransacciones());
    }

    @Test
    void testGetTransaccionById() {
        Transaccion transaccion = transaccionService.getTransaccionById(1L);
        assertNotNull(transaccion);
        assertEquals(500.0, transaccion.getMonto());
    }

    @Test
    void testSaveTransaccion() {
        Transaccion transaccion = new Transaccion();
        transaccion.setMonto(1000.0);
        transaccion.setDescripcion("Venta");
        Transaccion savedTransaccion = transaccionService.saveTransaccion(transaccion);
        assertNotNull(savedTransaccion);
        assertEquals(1000.0, savedTransaccion.getMonto());
    }

    @Test
    void testDeleteTransaccion() {
        transaccionService.deleteTransaccion(1L);
        Transaccion transaccion = transaccionService.getTransaccionById(1L);
        assertNull(transaccion);
    }
}