package com.miportfolio.NJRG.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity

public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    @NotNull
    @Size (min = 1, max = 60, message = "ERROR! Longitnud inadecuada!")
    private String nombre;
    
    @NotNull
    @Size (min = 1, max = 60, message = "ERROR! Longitnud inadecuada!")
    private String apellido;
    
    @NotNull
    @Size (min = 1, max = 60, message = "ERROR! Longitnud inadecuada!")
    private String img;
    
    @NotNull
    private String descripcion;
    
}
