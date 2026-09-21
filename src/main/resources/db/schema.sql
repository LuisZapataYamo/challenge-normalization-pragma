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