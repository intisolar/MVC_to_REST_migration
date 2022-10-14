
package com.bd.empleados.exception;

/*Esta excepcion sera lanzada cuando no haya recursos dentro de una tabla*/
public class DataNotFoundException extends RuntimeException{
    
    public DataNotFoundException(String message){
        super(message);
    }
}
