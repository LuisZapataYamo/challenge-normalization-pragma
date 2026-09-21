package com.fintech;

import com.fintech.model.Cuenta;
import com.fintech.service.CuentaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CuentaServiceTest {
    @Autowired
    private CuentaService cuentaService;

    @Test
    void testGetAllCuentas() {
        assertNotNull(cuentaService.getAllCuentas());
    }

    @Test
    void testGetCuentaById() {
        Cuenta cuenta = cuentaService.getCuentaById(1L);
        assertNotNull(cuenta);
        assertEquals("123456789", cuenta.getNumeroCuenta());
    }

    @Test
    void testSaveCuenta() {
        Cuenta cuenta = new Cuenta();
        cuenta.setNumeroCuenta("987654321");
        cuenta.setSaldo(2000.0);
        Cuenta savedCuenta = cuentaService.saveCuenta(cuenta);
        assertNotNull(savedCuenta);
        assertEquals("987654321", savedCuenta.getNumeroCuenta());
    }

    @Test
    void testDeleteCuenta() {
        cuentaService.deleteCuenta(1L);
        Cuenta cuenta = cuentaService.getCuentaById(1L);
        assertNull(cuenta);
    }
}