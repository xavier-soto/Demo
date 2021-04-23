package com.xavier.demo.Tanque.Entity;

import com.fasterxml.jackson.annotation.JsonTypeId;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity()
@Table(name = "persona")

public class Persona {
@Id
@Column
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column
private String name;
@Column
private String apellidos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}


    // public Long Id();
        //@Column(name = "nombre", unique = false, nullable = true )
  //      public String nombre();

//        @Column(name = "edad", unique = false, nullable = true )
  //      public int edad();



