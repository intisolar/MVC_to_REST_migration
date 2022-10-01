package com.bd.empleados.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EMPLEADOS")
public class Empleado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="EMPLEADO_ID")
    private Long empleadoID;
    
    @Column(name="NOMBRE")
    private String nombre;
    
    @Column(name="APELLIDO")
    private String apellido;
    
    @Column(name = "SUELDO")
    private Float sueldo;
    
    @Column(name = "SECTOR")
    private String sector;
    
   
    
}
