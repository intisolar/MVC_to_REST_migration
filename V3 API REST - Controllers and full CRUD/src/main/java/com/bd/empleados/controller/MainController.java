package com.bd.empleados.controller;

import com.bd.empleados.model.dto.EmpleadoRequest;
import com.bd.empleados.model.dto.EmpleadoResponse;
import com.bd.empleados.model.dto.ListEmpleadoResponse;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;
import com.bd.empleados.service.EmpleadoService;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empleados")
@CrossOrigin(origins = "*")
public class MainController {

    @Autowired
    private EmpleadoService empleadoService;

    /*Vamos a dejar de devolver Strings y vamos a utilizar ResponseEntity del tipo
    de DTO que vamos a devolver.
    Ya no cargaremos información en el ModelMap*/
 /*Como ya no vamos a devolver vistas, aquellas que no requieran la interacción
    con base de datos van a ser manejados por el front.*/
 /*Aplicamos el mismo path a los métodos GET y POST que manejan los mismos datos*/
    @PostMapping
    @Transactional
    public ResponseEntity<EmpleadoResponse> save(@RequestBody @Valid EmpleadoRequest request) {
        System.out.println(request.getNombre());
        /*Retornamos un Response entity con el status correspondiente y en el 
        body aquella información que vamos a volcar en el front*/
        return ResponseEntity.status(HttpStatus.CREATED).body(empleadoService.create(request));
    }

    @GetMapping
    public ResponseEntity<ListEmpleadoResponse> list() {
        System.out.println("Se esta conectando con este endpoint");

        return ResponseEntity.ok().body(empleadoService.findAll());
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Void> delete(@PathVariable Long id) throws Exception {
        empleadoService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmpleadoResponse> findById(@PathVariable Long id) throws Exception {

        return ResponseEntity.ok().body(empleadoService.getResponseByID(id));
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<EmpleadoResponse> update(@PathVariable Long id,
            @RequestBody @Valid EmpleadoRequest request) throws Exception {
        return ResponseEntity.ok().body(empleadoService.update(request, id));
    }
}
