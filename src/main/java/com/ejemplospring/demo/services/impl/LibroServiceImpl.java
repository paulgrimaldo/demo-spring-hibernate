package com.ejemplospring.demo.services.impl;

import com.ejemplospring.demo.models.Libro;
import com.ejemplospring.demo.repositories.LibroRepository;
import com.ejemplospring.demo.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("libroService")
public class LibroServiceImpl implements LibroService {

    @Autowired
    private LibroRepository libroRepository;

    @Override
    public List<Libro> findAll() {
        return libroRepository.findAll();
    }
}
