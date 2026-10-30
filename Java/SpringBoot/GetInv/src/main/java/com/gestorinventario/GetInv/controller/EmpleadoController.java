package com.gestorinventario.GetInv.controller;

import com.gestorinventario.GetInv.dto.empleado.EmpleadoRegistroDTO;
import com.gestorinventario.GetInv.dto.empleado.EmpleadoRespuestaDTO;
import com.gestorinventario.GetInv.service.EmpleadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inv/empleado")
@RequiredArgsConstructor
public class EmpleadoController {

    private final EmpleadoService empleadoService;

    @GetMapping("/{id}")
    public EmpleadoRespuestaDTO obtenerEmpleado(@PathVariable long id){
        return empleadoService.obtenerEmpleado(id);
    }

    @PostMapping()
    public void guardarEmpleado(@RequestBody EmpleadoRegistroDTO empleadoRequest){
        empleadoService.guardarEmpleado(empleadoRequest);
    }

    @DeleteMapping("/{id}")
    public void eliminarEmpleado(@PathVariable long id){
        empleadoService.eliminarEmpleado(id);
    }

    @PatchMapping("/{id}")
    public void actualizarEmpleado(@PathVariable long id, @RequestBody EmpleadoRegistroDTO empleadoRegistro){
        empleadoService.actualizarEmpleado(id, empleadoRegistro);
    }

}
