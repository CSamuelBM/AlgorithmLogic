package com.gestorinventario.GetInv.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity @Table(name = "sucursales")
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class SucursalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idSucursal;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "nombreEmpresa")
    private String nombreEmpresa;

    @Column(name = "ciudad")
    private String ciudad;

    @Column(name = "correo")
    private String correo;

    @OneToMany(mappedBy = "sucursal", cascade = CascadeType.REMOVE)
    private List<ProveedorEntity> proveedorList;
}
