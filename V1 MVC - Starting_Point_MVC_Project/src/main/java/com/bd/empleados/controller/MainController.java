package com.bd.empleados.controller;

import com.bd.empleados.model.entity.Empleado;
import com.bd.empleados.service.EmpleadoService;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

  @Autowired
  public EmpleadoService empleadoService;


  @GetMapping("new")
  public String save(ModelMap model) {

    model.addAttribute("empleado", new Empleado());

    return "create-new.html";

  }

  @PostMapping("create")
  @Transactional
  public String save(@ModelAttribute Empleado empleado) {

    empleadoService.create(empleado);

    return "redirect:/";
  }

  @GetMapping("list")
  public String list(ModelMap model) {

    model.addAttribute("list", empleadoService.findAll());

    return "list.html";
  }

}
