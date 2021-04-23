package com.xavier.demo.Tanque.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonaServiceImp implements PersonaService {
    @Autowired
    private PersonaRepositorio repositorio;
    @Override
    public List<Persona> listar() {
        return repositorio.findALL();
    }

    @Override
    public Persona listarId(int id) {
        return repositorio.finONE(id);
    }

    @Override
    public Persona add(Persona p) {
        return repositorio.save(p);
    }

    @Override
    public Persona edit(Persona p) {
        return repositorio.save(p);
    }

    @Override
    public Persona delete(int id) {
        return null;
    }
}
