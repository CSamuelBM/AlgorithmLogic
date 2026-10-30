package com.gestorinventario.GetInv.dto.empleado;

import java.time.LocalDate;

public record EmpleadoRegistroDTO(
        String nombre,
        String correo,
        String clave,
        String ciudad,
        LocalDate fechaIngreso
) { }
