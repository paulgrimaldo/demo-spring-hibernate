package com.ejemplospring.demo.repositories;

import com.ejemplospring.demo.models.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {

    Optional<Autor> findByNombre(@Param("nombre") String nombre);

//    @Query(value = "Select * from autores where nombre=:nombre")
//    Optional<Autor> findPorNombre(String nombre);
}
