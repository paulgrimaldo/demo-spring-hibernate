package com.ejemplospring.demo.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class AutorDto {

    private Long id;
    @NotNull
    private String nombre;


    public AutorDto(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public AutorDto() {
    }

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
}
