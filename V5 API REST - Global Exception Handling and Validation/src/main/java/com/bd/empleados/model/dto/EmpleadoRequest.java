package com.bd.empleados.model.dto;

import javax.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmpleadoRequest {

   
    @NotEmpty(message = "El campo 'nombre' no puede estar vacío.")
    private String nombre;
    
    
    @NotEmpty(message = "El campo 'apellido' no puede estar vacío.")
    private String apellido;
    
    
    @NotEmpty(message = "El campo 'sector' no puede estar vacío.")
    private String sector;
    
    
}