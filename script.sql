DROP DATABASE IF EXISTS sistemafarmacia;
-- creamos la bd
CREATE DATABASE sistemafarmacia;
-- activamos la bd
USE sistemafarmacia;

CREATE TABLE  medicamento(
id_medicamento  int auto_increment,
nombre varchar(255),
descripcion varchar(250) ,
categoria varchar (50),
precio decimal (10,2) ,
stock int ,
fecha_vencimiento date,
proveedor varchar (100),
primary key(id_medicamento)
);
 insert into medicamento (nombre,descripcion,categoria,precio,stock,fecha_vencimiento,proveedor) 
 values ('paracetamol','Analgesico comun','Analgesico',5,100,20241231,'Genérico Pharma');
 insert into medicamento (nombre,descripcion,categoria,precio,stock,fecha_vencimiento,proveedor) 
 values ('Amoxicilina','Antibiotico','Antibiotico',10.5,50,20240901,'Farmacia A');
 insert into medicamento (nombre,descripcion,categoria,precio,stock,fecha_vencimiento,proveedor) 
 values ('Vitamina C','Suplemento Vitaminico','Vitaminas',8.75,75,20241231,'Proveedor B');
 insert into medicamento (nombre,descripcion,categoria,precio,stock,fecha_vencimiento,proveedor) 
 values ('Ibuprofeno','Antiinflamatorio','Analgesico',6.25,60,20240606,'Genérico Pharma');
 insert into medicamento (nombre,descripcion,categoria,precio,stock,fecha_vencimiento,proveedor) 
 values ('Omeprazol','Medicamento Gi','Gi',12.3,40,20240805,'Genérico Pharma');
 select * from medicamento
