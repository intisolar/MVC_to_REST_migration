
package com.bd.empleados.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmpleadoResponse {

/*Quiero devolver el nombre completo del empleado*/
    
    private String nombreCompleto;
    private String sector;
}
