package com.bd.empleados.controller;

import com.bd.empleados.model.dto.EmpleadoRequest;

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
    public String save(ModelMap model){
        
        model.addAttribute("request", new EmpleadoRequest());
        
        return "create-new.html";
                
    }
    
    @PostMapping("create")
    @Transactional
    public String save(@ModelAttribute EmpleadoRequest request){
        
        empleadoService.create(request);
        
        return "redirect:/";
    }
    
    @GetMapping("list")
    public String list(ModelMap model){
        
        model.addAttribute("response", empleadoService.findAll());
        
        return "list.html";
    }
            
}
