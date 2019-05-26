package com.ejemplospring.demo.services.impl;

import com.ejemplospring.demo.models.Autor;
import com.ejemplospring.demo.repositories.AutorRepository;
import com.ejemplospring.demo.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("autorService")
public class AutorServiceImpl implements AutorService {
    @Autowired
    private AutorRepository autorRepository;

    @Override
    public List<Autor> findAll() {
        return autorRepository.findAll();
    }

    @Override
    public Optional<Autor> findByNombre(String nombre) {
        return autorRepository.findByNombre(nombre);
    }

    @Override
    public Autor save(Autor autor) {
        return autorRepository.save(autor);
    }
}
