package com.bd.empleados.mapper;

import com.bd.empleados.model.dto.EmpleadoRequest;
import com.bd.empleados.model.dto.EmpleadoResponse;
import com.bd.empleados.model.entity.Empleado;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class EmpleadoMapper {

    public Empleado map(EmpleadoRequest request) {

        Empleado empleado = new Empleado();

        /*Aquí pasa la alquimia*/
        
        empleado.setNombre(request.getNombre());
        empleado.setApellido(request.getApellido());
        empleado.setSector(request.getSector());
        
        
        
        return empleado;

    }
    
    /*Vamos a necesitar crear un mapper que nos transforme un objeto en DTO*/
    public List<EmpleadoResponse> map (List<Empleado> empleados){
        List<EmpleadoResponse> listResponse = new  ArrayList<>();
        
        /*Vamos a necesitar recorrer la lista para pasarle los empleados, 
        pero además transformar objetos en DTOs en el medio!*/
        for (Empleado empleado : empleados) {
            listResponse.add(map(empleado));
        }
        
        return listResponse;
    }
    
    
    public EmpleadoResponse map(Empleado empleado){
        
        EmpleadoResponse response = new EmpleadoResponse();
        
        response.setId(empleado.getEmpleadoID());
        response.setNombreCompleto(empleado.getNombre()+" "+empleado.getApellido());
        response.setSector(empleado.getSector());
        
        return response;
    }

}
