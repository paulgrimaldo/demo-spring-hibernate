package com.ejemplospring.demo.services;

import com.ejemplospring.demo.models.Autor;

import java.util.List;
import java.util.Optional;

public interface AutorService {

    List<Autor> findAll();
    Optional<Autor> findByNombre(String nombre);
    Autor save(Autor autor);
}
