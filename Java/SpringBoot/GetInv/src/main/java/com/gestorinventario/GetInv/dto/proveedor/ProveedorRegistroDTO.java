package com.gestorinventario.GetInv.dto.proveedor;

import com.gestorinventario.GetInv.entity.SucursalEntity;

public record ProveedorRegistroDTO (
        String telefono,
        SucursalEntity sucursal
) { }
