package com.fintech;

import com.fintech.model.Cliente;
import com.fintech.service.ClienteService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ClienteServiceTest {
    @Autowired
    private ClienteService clienteService;

    @Test
    void testGetAllClientes() {
        assertNotNull(clienteService.getAllClientes());
    }

    @Test
    void testGetClienteById() {
        Cliente cliente = clienteService.getClienteById(1L);
        assertNotNull(cliente);
        assertEquals("Juan Perez", cliente.getNombre());
    }

    @Test
    void testSaveCliente() {
        Cliente cliente = new Cliente();
        cliente.setNombre("Ana Gomez");
        cliente.setEmail("ana@example.com");
        Cliente savedCliente = clienteService.saveCliente(cliente);
        assertNotNull(savedCliente);
        assertEquals("Ana Gomez", savedCliente.getNombre());
    }

    @Test
    void testDeleteCliente() {
        clienteService.deleteCliente(1L);
        Cliente cliente = clienteService.getClienteById(1L);
        assertNull(cliente);
    }
}