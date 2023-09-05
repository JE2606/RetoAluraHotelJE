create database alurabd;
use alurabd;

-- LOGIN

create table Usuarios(
	id int auto_increment primary key not null,
    user_name varchar(7) not null,
    user_pass varchar(7) not null
);
insert into Usuarios(user_name, user_pass)
values('admin1', 'root');
insert into Usuarios(user_name, user_pass)
values('juane', 'root2');
select * from Usuarios;
select * from Usuarios where Usuarios.user_name ='admin1' and Usuarios.user_pass ='root';

-- DATOS PARA RESERVA

create table Habitaciones(
	id int auto_increment primary key not null,
    tipo nvarchar(20) not null,
    precio int not null
);
insert into Habitaciones(tipo, precio)
values
	('Standard',200),
	('Deluxe', 350),
    ('Suite', 500);
select * from Habitaciones;
select precio from Habitaciones;
create table FormasPago(
	id int auto_increment primary key not null,
    forma char(20) not null
);
insert into FormasPago(forma)
values
	('Efectivo'),
    ('Deposito'),
    ('Tarjeta de Credito'),
    ('Tarjeta de Debito');
    
select * from FormasPago;

select tipo from Habitaciones;
select forma from FormasPago;

-- RESERVA

create table Reserva(
	numReserva int primary key not null,
    checkIn date,
    checkOut date,
    tipoHabitacion char(20),
    formaPago char(20),
    total double
);
select * from Reserva;

create table Registro(
	id nvarchar(30) primary key not null,
    nombre nvarchar(60),
    apellidos nvarchar(60),
    fechaNacimiento date,
    telefono nvarchar(30),
    numReserva int,
    foreign key (numReserva) references Reserva (numReserva)
);

insert into Registro (id, nombre, apellidos, fechaNacimiento, telefono, numReserva)
values ();

select * from Registro;
SELECT numReserva FROM Reserva ORDER BY numReserva DESC LIMIT 1;
select * from Reserva;
ALTER TABLE Reserva ADD COLUMN fechaInsercion TIMESTAMP;
SELECT numReserva FROM Reserva ORDER BY fechaInsercion DESC LIMIT 1;



