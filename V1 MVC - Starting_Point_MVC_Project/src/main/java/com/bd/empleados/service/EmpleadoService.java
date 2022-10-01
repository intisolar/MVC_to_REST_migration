package com.bd.empleados.service;

import com.bd.empleados.model.entity.Empleado;
import com.bd.empleados.repository.EmpleadoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*El servicio solo se encarga de interactuar con el repositorio*/
@Service
public class EmpleadoService {

  @Autowired
  private EmpleadoRepository empleadoRepository;

  public void create(Empleado empleado) {

    empleadoRepository.save(empleado);

  }

  public List<Empleado> findAll() {

    List<Empleado> empleados = empleadoRepository.findAll();

    return empleados;
  }

}
