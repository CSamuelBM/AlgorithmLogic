package com.gestorinventario.GetInv.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Table(name = "proveedores")
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class ProveedorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProveedor")
    private long idProveedor;

    @Column(name = "telefono")
    private String telefono;

    @ManyToOne
    @JoinColumn(name = "idSucursal")
    private SucursalEntity sucursal;
}
