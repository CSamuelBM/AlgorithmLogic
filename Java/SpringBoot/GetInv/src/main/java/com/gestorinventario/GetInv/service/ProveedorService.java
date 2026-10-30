package com.gestorinventario.GetInv.service;

import com.gestorinventario.GetInv.dto.proveedor.ProveedorRespuestaDTO;
import com.gestorinventario.GetInv.dto.proveedor.ProveedorRegistroDTO;
import com.gestorinventario.GetInv.entity.ProveedorEntity;
import com.gestorinventario.GetInv.repository.ProveedorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProveedorService {

    private final ProveedorRepository proveedorRepository;

    public ProveedorRespuestaDTO obtenerProveedor(long idProveedor){
        ProveedorEntity proveedor = proveedorRepository.findById(idProveedor).orElseThrow();

        return new ProveedorRespuestaDTO(
                proveedor.getIdProveedor(),
                proveedor.getTelefono(),
                proveedor.getSucursal().getIdSucursal(),
                proveedor.getSucursal().getNombre(),
                proveedor.getSucursal().getNombreEmpresa(),
                proveedor.getSucursal().getCiudad(),
                proveedor.getSucursal().getCorreo()
        );
    }

    public void guardarProveedor(ProveedorRegistroDTO proveedorRegistro){
        ProveedorEntity proveedor = new ProveedorEntity();

        proveedor.setTelefono(proveedorRegistro.telefono());
        proveedor.setSucursal(proveedorRegistro.sucursal());

        proveedorRepository.save(proveedor);
    }

    public void eliminarProveedor(long idProveedor){
        proveedorRepository.deleteById(idProveedor);
    }

    public void actualizarProveedor(long idProveedor, ProveedorRegistroDTO proveedorRegistro){
        ProveedorEntity proveedor = proveedorRepository.findById(idProveedor).orElseThrow();

        proveedor.setTelefono(proveedorRegistro.telefono());
        proveedor.setSucursal(proveedorRegistro.sucursal());
    }

}
