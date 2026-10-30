package com.gestorinventario.GetInv.dto.empleado;

import java.time.LocalDate;

public record EmpleadoRespuestaDTO(
        long idEmpleado,
        String nombre,
        String correo,
        String ciudad,
        LocalDate fechaIngreso
) { }