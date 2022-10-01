package com.bd.empleados.service;

import com.bd.empleados.mapper.EmpleadoMapper;
import com.bd.empleados.model.dto.EmpleadoRequest;
import com.bd.empleados.model.dto.ListEmpleadoResponse;
import com.bd.empleados.model.entity.Empleado;
import com.bd.empleados.repository.EmpleadoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService {
    
    @Autowired
    private EmpleadoRepository empleadoRepository;
    
    @Autowired
    private EmpleadoMapper mapper;
    
    public void create(EmpleadoRequest request) {

        /*El servicio solo se encarga de interactuar con el repositorio*/
        Empleado empleado = mapper.map(request);
        
        empleadoRepository.save(empleado);
        
    }

    /*Cómo hacemos para enviar en vez de una lista de empleados un DTO?*/
//Voy a tener que devolver una response en vez de una Lista
    public ListEmpleadoResponse findAll() {
        
        List<Empleado> empleados = empleadoRepository.findAll();

        /*Voy a necesitar un mapper que me reciba una lista de empleados y me devuelva empleado response*/
        ListEmpleadoResponse empleadosResponse = new ListEmpleadoResponse();
        empleadosResponse.setEmpleados(mapper.map(empleados));
        
        return empleadosResponse;
    }
    
}
