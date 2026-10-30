package com.gestorinventario.GetInv.controller;

import com.gestorinventario.GetInv.dto.sucursal.SucursalRegistroDTO;
import com.gestorinventario.GetInv.dto.sucursal.SucursalRespuestaDTO;
import com.gestorinventario.GetInv.service.SucursalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inv/sucursal")
@RequiredArgsConstructor
public class SucursalController {

    private final SucursalService sucursalService;

    @GetMapping("/{id}")
    public SucursalRespuestaDTO obtenerSucursal(@PathVariable long id){
        return sucursalService.obtenerSucursal(id);
    }

    @PutMapping
    public void guardarSucursal(@RequestBody SucursalRegistroDTO sucursalRegistro){
        sucursalService.guardarSucursal(sucursalRegistro);
    }

    @DeleteMapping("/{id}")
    public void eliminarSucursal(@PathVariable long id){
        sucursalService.eliminarSucursal(id);
    }

    @PatchMapping
    public void actualizarSucursal(@PathVariable long id, @RequestBody SucursalRegistroDTO sucursalRegistro){
        sucursalService.actualizarSucursal(id, sucursalRegistro);
    }

}
