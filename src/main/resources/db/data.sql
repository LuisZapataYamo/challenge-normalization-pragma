INSERT INTO Cliente (nombre, email) VALUES ('Juan Perez', 'juan@example.com');
INSERT INTO Cuenta (numeroCuenta, saldo, cliente_id) VALUES ('123456789', 1000.0, 1);
INSERT INTO Transaccion (monto, descripcion, cuenta_id) VALUES (500.0, 'Compra', 1);
INSERT INTO ProductoFinanciero (nombre, tasaInteres) VALUES ('Prestamo Personal', 5.0);