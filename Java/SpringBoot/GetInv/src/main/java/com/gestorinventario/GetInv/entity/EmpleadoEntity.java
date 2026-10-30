package com.gestorinventario.GetInv.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity @Table(name = "empleados")
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class EmpleadoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEmpleado")
    private long idEmpleado;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "correo")
    private String correo;

    @Column(name = "clave")
    private String clave;

    @Column(name = "ciudad")
    private String ciudad;

    @Column(name = "fechaIngreso")
    private LocalDate fechaIngreso;
}
