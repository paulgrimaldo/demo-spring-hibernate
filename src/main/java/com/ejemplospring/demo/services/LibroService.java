package com.ejemplospring.demo.services;

import com.ejemplospring.demo.models.Libro;

import java.util.List;

public interface LibroService {

    List<Libro> findAll();
}
