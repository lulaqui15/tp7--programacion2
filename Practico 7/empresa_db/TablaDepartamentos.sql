USE empresa_db;

-- Crear tabla departamentos
CREATE TABLE departamentos (
    id_depto INT AUTO_INCREMENT PRIMARY KEY,
    nombre_depto VARCHAR(100) NOT NULL
);

-- Insertar algunos departamentos
INSERT INTO departamentos (nombre_depto) VALUES 
('Recursos Humanos'),
('Sistemas'),
('Finanzas'),
('Marketing'),
('Administracion');

-- Modificar tabla empleados
ALTER TABLE empleados DROP COLUMN departamento;
ALTER TABLE empleados ADD COLUMN id_depto INT;
ALTER TABLE empleados ADD CONSTRAINT fk_depto 
    FOREIGN KEY (id_depto) REFERENCES departamentos(id_depto);

-- Agregar columna para la foto
ALTER TABLE empleados ADD COLUMN foto VARCHAR(255);

