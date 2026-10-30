package com.gestorinventario.GetInv.service;

import com.gestorinventario.GetInv.dto.empleado.EmpleadoRegistroDTO;
import com.gestorinventario.GetInv.dto.empleado.EmpleadoRespuestaDTO;
import com.gestorinventario.GetInv.entity.EmpleadoEntity;
import com.gestorinventario.GetInv.repository.EmpleadoRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmpleadoService {

    private final EmpleadoRepository empleadoRepository;

    public EmpleadoRespuestaDTO obtenerEmpleado(long id) {
        EmpleadoEntity empleado = empleadoRepository.findById(id).orElseThrow();

        return new EmpleadoRespuestaDTO(
                empleado.getIdEmpleado(),
                empleado.getNombre(),
                empleado.getCorreo(),
                empleado.getCiudad(),
                empleado.getFechaIngreso()
        );
    }

    public void guardarEmpleado(EmpleadoRegistroDTO empleadoRequest) {
        EmpleadoEntity empleado = new EmpleadoEntity();

        empleado.setNombre(empleadoRequest.nombre());
        empleado.setCorreo(empleadoRequest.correo());
        empleado.setClave(empleadoRequest.clave());
        empleado.setCiudad(empleadoRequest.ciudad());
        empleado.setFechaIngreso(empleadoRequest.fechaIngreso());

        empleadoRepository.save(empleado);
    }

    public void eliminarEmpleado(long id) {
        empleadoRepository.deleteById(id);
    }

    @Transactional
    public void actualizarEmpleado(long idEmpleado, EmpleadoRegistroDTO empleadoRegistro) {
        EmpleadoEntity empleado = empleadoRepository.findById(idEmpleado).orElseThrow();

        empleado.setNombre(empleadoRegistro.nombre());
        empleado.setCorreo(empleadoRegistro.correo());
        empleado.setClave(empleadoRegistro.clave());
        empleado.setCiudad(empleadoRegistro.ciudad());
    }

}
