package com.xavier.demo.Tanque.Entity;

import com.xavier.demo.Tanque.Entity.Persona;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import javax.persistence.Entity;
import java.util.List;


public interface PersonaRepositorio extends Repository<Persona,Integer>{
    List<Persona>findALL();
    Persona finONE(int id);
    Persona save(Persona p);
    void delete(Persona p);








}