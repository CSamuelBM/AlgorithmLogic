package com.gestorinventario.GetInv.dto.sucursal;

import com.gestorinventario.GetInv.dto.proveedor.ProveedorMapeoDTO;
import com.gestorinventario.GetInv.entity.SucursalEntity;

import java.util.List;

public record SucursalRespuestaDTO(
        long idSucursal,
        String nombre,
        String nombreEmpresa,
        String ciudad,
        String correo,
        List<ProveedorMapeoDTO> proveedorList
) {
    public static SucursalRespuestaDTO sucursalRespuestaDTO(SucursalEntity sucursal) {
        return new SucursalRespuestaDTO(
                sucursal.getIdSucursal(),
                sucursal.getNombre(),
                sucursal.getNombreEmpresa(),
                sucursal.getCiudad(),
                sucursal.getCorreo(),
                sucursal.getProveedorList().stream().map(
                        proveedor -> new ProveedorMapeoDTO(
                                proveedor.getIdProveedor(),
                                proveedor.getTelefono()                        )
                ).toList()
        );
    }
}
