package com.xavier.demo.Control;

import com.xavier.demo.Tanque.Entity.Persona;
import com.xavier.demo.Tanque.Entity.PersonaRepositorio;
import com.xavier.demo.Tanque.Entity.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class controlador {
    @Autowired
    private PersonaService service;

    @GetMapping
    public List<Persona> listar(){
       return service.listar();
    }
    @PutMapping(path = {"/{id}"} )
    public Persona editar (@RequestBody Persona p,@PathVariable("id") int id){
        p.setId(id);
       return service.edit(p);
    }
    @DeleteMapping(path = {"/{id}"})
    public Persona delete (@PathVariable("id") int id){
        return service.delete(id);
    }
    @PostMapping
    public Persona agregar(@RequestBody Persona p){
        return service.add(p);


    }


}
