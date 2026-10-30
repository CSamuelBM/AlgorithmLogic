package com.gestorinventario.GetInv.service;

import com.gestorinventario.GetInv.dto.sucursal.SucursalRegistroDTO;
import com.gestorinventario.GetInv.dto.sucursal.SucursalRespuestaDTO;
import com.gestorinventario.GetInv.entity.SucursalEntity;
import com.gestorinventario.GetInv.repository.SucursalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SucursalService {

    private final SucursalRepository sucursalRepository;

    public SucursalRespuestaDTO obtenerSucursal(long idSucursal){
        SucursalEntity sucursal = sucursalRepository.findById(idSucursal).orElseThrow();

        return new SucursalRespuestaDTO(
                sucursal.getIdSucursal(),
                sucursal.getNombre(),
                sucursal.getNombreEmpresa(),
                sucursal.getCiudad(),
                sucursal.getCorreo(),
                SucursalRespuestaDTO.sucursalRespuestaDTO(sucursal).proveedorList()
        );
    }

    public void guardarSucursal(SucursalRegistroDTO sucursalRegistro){
        SucursalEntity sucursal = new SucursalEntity();

        sucursal.setNombre(sucursalRegistro.nombre());
        sucursal.setNombreEmpresa(sucursalRegistro.nombreEmpresa());
        sucursal.setCiudad(sucursalRegistro.ciudad());
        sucursal.setCorreo(sucursalRegistro.correo());

        sucursalRepository.save(sucursal);
    }

    public void eliminarSucursal(long idSucursal){
        sucursalRepository.deleteById(idSucursal);
    }

    public void actualizarSucursal(long idSucursal, SucursalRegistroDTO sucursalRegistro){
        SucursalEntity sucursal = sucursalRepository.findById(idSucursal).orElseThrow();

        sucursal.setNombre(sucursalRegistro.nombre());
        sucursal.setNombreEmpresa(sucursalRegistro.nombreEmpresa());
        sucursal.setCiudad(sucursalRegistro.ciudad());
        sucursal.setCorreo(sucursalRegistro.correo());
    }
}
