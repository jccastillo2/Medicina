Create Table Tratamiento(
    id serial,
    descripcion varchar (45) null,
    PRIMARY key(id),
    Paciente_id int null,
    FOREIGN key (Paciente_id) references Paciente(id)
);