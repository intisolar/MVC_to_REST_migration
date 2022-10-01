package com.bd.empleados.service;

import com.bd.empleados.mapper.EmpleadoMapper;
import com.bd.empleados.model.dto.EmpleadoRequest;
import com.bd.empleados.model.dto.EmpleadoResponse;
import com.bd.empleados.model.dto.ListEmpleadoResponse;
import com.bd.empleados.model.entity.Empleado;
import com.bd.empleados.repository.EmpleadoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Autowired
    private EmpleadoMapper mapper;

    /*Ahora mi método debe devolver un empleado Response que será enviado 
    a las vistas*/
    public EmpleadoResponse create(EmpleadoRequest request) {

        Empleado empleado = mapper.map(request);

        empleadoRepository.save(empleado);
        return mapper.map(empleado);

    }

    public ListEmpleadoResponse findAll() {

        List<Empleado> empleados = empleadoRepository.findAll();

        ListEmpleadoResponse empleadosResponse = new ListEmpleadoResponse();
        empleadosResponse.setEmpleados(mapper.map(empleados));

        return empleadosResponse;
    }

    
    public void delete(Long id) throws Exception {

        findByID(id);
        empleadoRepository.deleteById(id);

    }

    public EmpleadoResponse update(EmpleadoRequest request, Long id) throws Exception {

        Empleado empleado = findByID(id);
        empleado.setNombre(request.getNombre());
        empleado.setApellido(request.getApellido());
        empleado.setSector(request.getSector());
        
        empleadoRepository.save(empleado);
        return mapper.map(empleado);

    }

    public Empleado findByID(Long ID) throws Exception {

        Optional<Empleado> empleado = empleadoRepository.findById(ID);
        if (empleado.isPresent()) {
            return empleado.get();
        } else {
            throw new Exception("Este empleado no existe");
        }

    }

    public EmpleadoResponse getResponseByID(Long ID) throws Exception {
        return mapper.map(findByID(ID));
    }
}
