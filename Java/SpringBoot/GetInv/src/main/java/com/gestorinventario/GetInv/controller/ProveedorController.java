package com.gestorinventario.GetInv.controller;

import com.gestorinventario.GetInv.dto.proveedor.ProveedorRespuestaDTO;
import com.gestorinventario.GetInv.dto.proveedor.ProveedorRegistroDTO;
import com.gestorinventario.GetInv.service.ProveedorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inv/proveedor")
@RequiredArgsConstructor
public class ProveedorController {

    private final ProveedorService proveedorService;

    @GetMapping("/{id}")
    public ProveedorRespuestaDTO obtenerProveedor(@PathVariable long id) {
        return  proveedorService.obtenerProveedor(id);
    }

    @PutMapping
    public void guardarProveedor(@RequestBody  ProveedorRegistroDTO proveedorRegistro){
        proveedorService.guardarProveedor(proveedorRegistro);
    }

    @DeleteMapping("/{id}")
    public void eliminarProveedor(@PathVariable long id){
        proveedorService.eliminarProveedor(id);
    }

    @PatchMapping("/{id}")
    public void actualizarProveedor(@PathVariable long id, @RequestBody ProveedorRegistroDTO proveedorRegistro){
        proveedorService.actualizarProveedor(id, proveedorRegistro);
    }

}
