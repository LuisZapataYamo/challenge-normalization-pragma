# Prompt para Mejorar el Codigo Base

Copia y pega el siguiente contenido completo en un asistente de IA (Claude, ChatGPT, etc.)
para obtener un ZIP con el proyecto arrancable. Si el adjunto es una carcasa (docs/placeholders),
el asistente debe materializar la estructura del stack del briefing, sin resolver las fases del reto.

---

```
## Briefing del reto (autoridad)
Este bloque manda sobre los archivos adjuntos. El stack y el rol salen de AQUÍ, no de un topic genérico ni de markdown placeholder.

### Perfil
Chapter Backend, Especialidad Desarrollador, Tecnología Java, Advanced

### Brecha de conocimiento
Implementa un proceso de normalización en una base de datos según las formas normales y ha usado un modelo Entidad-Relación.

### Misión / candidato
Candidato con experiencia backend en Java

### Reto
- Tema: Diseño e Implementación de un Modelo de Datos Normalizado
- Seniority: advanced-l1
- Tipo: practical
- Título: Normalización de Modelo de Datos
- Tiempo estimado: 4-6 horas

### Fases (trabajo del HUMANO — PROHIBIDO completarlas)
No implementes estos entregables. Dejalos como hueco pedagógico. El asistente solo materializa el proyecto arrancable para que el participante pueda trabajar.
- Fase 1: Diseño Inicial del Modelo de Datos — objetivo: Crear un modelo de datos que represente las entidades y relaciones necesarias para el sistema. — entregable (NO resolver): Diagrama Entidad-Relación completo.
- Fase 2: Aplicación de Formas Normales — objetivo: Aplicar las formas normales al modelo de datos para eliminar redundancias y mejorar la integridad. — entregable (NO resolver): Modelo de datos normalizado con formas normales aplicadas.
- Fase 3: Implementación del Modelo de Datos — objetivo: Implementar el modelo de datos normalizado en una base de datos. — entregable (NO resolver): Base de datos con el modelo de datos normalizado implementado y datos de prueba insertados.

Eres un asistente experto en análisis, corrección y generación de archivos de cualquier tipo:
código fuente, documentación, hojas de cálculo, documentos Word, configuraciones, entre otros.
Voy a enviarte una cadena de texto que contiene uno o más archivos. Cada archivo está delimitado por un marcador con el siguiente formato:
// === ARCHIVO: ruta/del/archivo.extension ===
o también puede aparecer como:
## === ARCHIVO: ruta/del/archivo.extension ===
Lo que sigue al marcador puede ser:

El contenido real del archivo (código, texto, YAML, etc.)
Una descripción en lenguaje natural de lo que debe contener el archivo


TU TAREA
PASO 1 — Detección y extracción
Identifica todos los archivos presentes en la cadena. Para cada archivo extrae:

Su ruta completa (ej: src/main/java/com/pragma/Service.java)
Su contenido o descripción

PASO 2 — Clasificación por tipo
Clasifica cada archivo en una de estas categorías:
A) Código fuente (Java, Python, TypeScript, JavaScript, Kotlin, etc.)
B) Configuración / documentación (YAML, properties, Markdown, JSON, txt, etc.)
C) Excel (.xlsx, .xls, .csv)
D) Word (.docx, .doc)
E) Otro tipo de archivo binario o especial
PASO 3 — Clasificación de errores en código fuente

Objetivo prioritario: que el proyecto compile. No corrijas flujo de negocio ni lógica funcional.

Antes de modificar cualquier archivo de código fuente, clasifica cada problema encontrado en una de estas dos categorías:
🔴 ERROR DE COMPILACIÓN — corregir siempre
Son errores que impiden que el proyecto arranque, sin valor pedagógico:

Import faltante o incorrecto
Clase, método o variable referenciada que no existe en ningún archivo del proyecto
Error de sintaxis
Anotación con atributos inválidos
Dependencia ausente en pom.xml, package.json, etc.
Archivo referenciado que no existe y debe ser creado con implementación mínima

→ CORREGIR estos errores.
🟡 PROBLEMA FUNCIONAL O DE CALIDAD — preservar siempre
Son problemas que no impiden compilar. Pueden ser intencionales para el aprendizaje:

Clave secreta hardcodeada ("secret", "password123")
API deprecada que funciona pero tiene reemplazo moderno
Lógica de negocio incorrecta o incompleta
Código redundante o de baja legibilidad
Falta de validaciones en flujo de negocio
Patrones de diseño incorrectos pero funcionales
Concurrencia no segura
Configuración funcional pero no óptima

→ PRESERVAR tal cual. No corregir, no mejorar, no comentar.
PASO 4 — Procesamiento según tipo de archivo
Tipo A — Código fuente
Aplica únicamente las correcciones clasificadas como 🔴 ERROR DE COMPILACIÓN.
No alteres ningún elemento clasificado como 🟡 PROBLEMA FUNCIONAL O DE CALIDAD.
Si falta un archivo referenciado, créalo con la implementación mínima necesaria para compilar.
Tipo B — Configuración / documentación
Extrae el contenido tal cual, sin modificaciones salvo errores evidentes de sintaxis
(ej: YAML mal indentado).
Tipo C — Excel (.xlsx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un archivo Excel funcional con:

Fila de encabezados en negrita con color de fondo distintivo
Columnas con ancho ajustado al contenido
Tipos de dato correctos por columna
Validaciones si la descripción lo indica
Hojas nombradas descriptivamente si hay más de una
Filas de ejemplo si no hay datos reales

Tipo D — Word (.docx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un documento Word funcional con:

Estilos de título (Título 1, Título 2) para jerarquía de secciones
Fuente legible (Calibri o equivalente), tamaño 11-12pt para cuerpo
Márgenes estándar
Tabla de contenido si tiene múltiples secciones
Tablas con encabezados en negrita si aplica

Tipo E — Otro
Genera el archivo con el contenido o estructura más apropiada según la descripción.
PASO 5 — Exportación en ZIP
Empaqueta todos los archivos en un único archivo ZIP descargable respetando exactamente
la estructura de rutas indicada por los marcadores.
El ZIP debe incluir:

Archivos de código con únicamente los errores de compilación corregidos
Archivos de configuración y documentación sin cambios
Archivos nuevos creados para resolver dependencias de compilación faltantes
Archivos Excel y Word generados desde descripción

IMPORTANTE: El ZIP debe estar listo para descargar al finalizar. No preguntes si el usuario
quiere generarlo. Simplemente genera el archivo y proporciona el enlace de descarga; No debes desplegar en el chat el resumen de lo que arreglaste al Zip, solo entregalo.

REGLAS IMPORTANTES

No omitas ningún archivo aunque no tenga errores ni modificaciones
Respeta los nombres y rutas exactas indicadas por los marcadores
Si un archivo no tiene marcador claro, infiere el nombre desde su contenido
Si la cadena contiene solo documentación o descripciones sin código, genera los archivos
correspondientes sin aplicar análisis de compilación
No agregues texto después del enlace de descarga del ZIP
No preguntes si el usuario quiere el ZIP: simplemente generalo siempre
Si detectas que falta un archivo de configuración necesario para compilar
(pom.xml, package.json, requirements.txt, build.gradle, etc.), créalo e inclúyelo
inferiendo su contenido desde los imports y frameworks detectados en el código
Nunca corrijas problemas 🟡 aunque parezcan obvios o fáciles de mejorar.
El participante que recibirá este proyecto los debe encontrar y resolver él mismo.


INPUT
Aquí está la cadena con los archivos:

// === ARCHIVO: src/main/java/com/fintech/model/Cliente.java ===
package com.fintech.model;

import jakarta.persistence.*;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;
    // Getters and setters
}

// === ARCHIVO: src/main/java/com/fintech/model/Cuenta.java ===
package com.fintech.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
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
    // Getters and setters
}

// === ARCHIVO: src/main/java/com/fintech/model/Transaccion.java ===
package com.fintech.model;

import jakarta.persistence.*;

@Entity
public class Transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double monto;
    private String descripcion;
    @ManyToOne
    private Cuenta cuenta;
    // Getters and setters
}

// === ARCHIVO: src/main/java/com/fintech/model/ProductoFinanciero.java ===
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

// === ARCHIVO: src/main/java/com/fintech/repository/ClienteRepository.java ===
package com.fintech.repository;

import com.fintech.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}

// === ARCHIVO: src/main/java/com/fintech/repository/CuentaRepository.java ===
package com.fintech.repository;

import com.fintech.model.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentaRepository extends JpaRepository<Cuenta, Long> {
}

// === ARCHIVO: src/main/java/com/fintech/repository/TransaccionRepository.java ===
package com.fintech.repository;

import com.fintech.model.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransaccionRepository extends JpaRepository<Transaccion, Long> {
}

// === ARCHIVO: src/main/java/com/fintech/repository/ProductoFinancieroRepository.java ===
package com.fintech.repository;

import com.fintech.model.ProductoFinanciero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoFinancieroRepository extends JpaRepository<ProductoFinanciero, Long> {
}

// === ARCHIVO: src/main/java/com/fintech/service/ClienteService.java ===
package com.fintech.service;

import com.fintech.model.Cliente;
import com.fintech.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    public Cliente getClienteById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void deleteCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}

// === ARCHIVO: src/main/java/com/fintech/service/CuentaService.java ===
package com.fintech.service;

import com.fintech.model.Cuenta;
import com.fintech.repository.CuentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuentaService {
    @Autowired
    private CuentaRepository cuentaRepository;

    public List<Cuenta> getAllCuentas() {
        return cuentaRepository.findAll();
    }

    public Cuenta getCuentaById(Long id) {
        return cuentaRepository.findById(id).orElse(null);
    }

    public Cuenta saveCuenta(Cuenta cuenta) {
        return cuentaRepository.save(cuenta);
    }

    public void deleteCuenta(Long id) {
        cuentaRepository.deleteById(id);
    }
}

// === ARCHIVO: src/main/java/com/fintech/service/TransaccionService.java ===
package com.fintech.service;

import com.fintech.model.Transaccion;
import com.fintech.repository.TransaccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransaccionService {
    @Autowired
    private TransaccionRepository transaccionRepository;

    public List<Transaccion> getAllTransacciones() {
        return transaccionRepository.findAll();
    }

    public Transaccion getTransaccionById(Long id) {
        return transaccionRepository.findById(id).orElse(null);
    }

    public Transaccion saveTransaccion(Transaccion transaccion) {
        return transaccionRepository.save(transaccion);
    }

    public void deleteTransaccion(Long id) {
        transaccionRepository.deleteById(id);
    }
}

// === ARCHIVO: src/main/java/com/fintech/service/ProductoFinancieroService.java ===
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

// === ARCHIVO: src/main/resources/db/schema.sql ===
CREATE TABLE Cliente (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    email VARCHAR(255)
);

CREATE TABLE Cuenta (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    numeroCuenta VARCHAR(255),
    saldo DOUBLE,
    cliente_id BIGINT,
    FOREIGN KEY (cliente_id) REFERENCES Cliente(id)
);

CREATE TABLE Transaccion (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    monto DOUBLE,
    descripcion VARCHAR(255),
    cuenta_id BIGINT,
    FOREIGN KEY (cuenta_id) REFERENCES Cuenta(id)
);

CREATE TABLE ProductoFinanciero (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    tasaInteres DOUBLE
);

// === ARCHIVO: src/main/resources/db/data.sql ===
INSERT INTO Cliente (nombre, email) VALUES ('Juan Perez', 'juan@example.com');
INSERT INTO Cuenta (numeroCuenta, saldo, cliente_id) VALUES ('123456789', 1000.0, 1);
INSERT INTO Transaccion (monto, descripcion, cuenta_id) VALUES (500.0, 'Compra', 1);
INSERT INTO ProductoFinanciero (nombre, tasaInteres) VALUES ('Prestamo Personal', 5.0);

// === ARCHIVO: src/test/java/com/fintech/ClienteServiceTest.java ===
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

// === ARCHIVO: src/test/java/com/fintech/CuentaServiceTest.java ===
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

// === ARCHIVO: src/test/java/com/fintech/TransaccionServiceTest.java ===
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

// === ARCHIVO: src/test/java/com/fintech/ProductoFinancieroServiceTest.java ===
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

// === ARCHIVO: pom.xml ===
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.fintech</groupId>
    <artifactId>fintech</artifactId>
    <version>1.0-SNAPSHOT</version>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.4.0</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <scope>runtime</scope>
        </dependency>
    </dependencies>
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>
```
