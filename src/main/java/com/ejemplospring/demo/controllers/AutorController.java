package com.ejemplospring.demo.controllers;

import com.ejemplospring.demo.dto.AutorDto;
import com.ejemplospring.demo.models.Autor;
import com.ejemplospring.demo.services.AutorService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("autor")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("findAll")
    public ResponseEntity<Object> getAutores() {
        List<Autor> autorList = autorService.findAll();
        HashMap<String, Object> map = new HashMap<>(3);
        map.put("status", HttpStatus.OK);
        map.put("autores", autorList);
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @GetMapping("find")
    public ResponseEntity<Object> getAutor(@RequestParam String nombre) {
        Optional<Autor> autor = autorService.findByNombre(nombre);

        HashMap<String, Object> map = new HashMap<>(3);
        HttpStatus status;
        if (autor.isPresent()) {
            status = HttpStatus.OK;
            map.put("status", status);
            map.put("autor", autor.get());
        } else {
            status = HttpStatus.NOT_FOUND;
        }
        return new ResponseEntity<>(map, status);
    }

    @PostMapping("save")
    public ResponseEntity<Object> saveAutor(@RequestBody AutorDto autorDto) {
        Autor autor = modelMapper.map(autorDto, Autor.class);
        autor = autorService.save(autor);

        AutorDto responseAutorDto = modelMapper.map(autor, AutorDto.class);
        HashMap<String, Object> map = new HashMap<>(3);
        map.put("status", HttpStatus.CREATED);
        map.put("autor", responseAutorDto);
        return new ResponseEntity<>(map, HttpStatus.CREATED);
    }

}
