package com.gestorinventario.GetInv.dto.proveedor;

public record ProveedorRespuestaDTO(
        long idProveedor,
        String telefono,
        long idSucursal,
        String nombre,
        String nombreEmpresa,
        String ciudad,
        String correo
) { }
