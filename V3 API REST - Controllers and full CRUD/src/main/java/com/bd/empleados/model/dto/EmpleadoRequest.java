package com.bd.empleados.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmpleadoRequest {

/*Datos que voy a enviar desde las vistas para crear mi nuevo empleado*/
    
    private String nombre;
    
    private String apellido;
    
    private String sector;
    
    
}
