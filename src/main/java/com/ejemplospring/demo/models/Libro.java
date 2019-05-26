package com.ejemplospring.demo.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "libros", schema = "libros-db", catalog = "")
public class Libro {
    private Long id;
    private String titulo;
    private String descripcion;
    private Autor autoresByAutorId;

    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "titulo")
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Basic
    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(id, libro.id) &&
                Objects.equals(titulo, libro.titulo) &&
                Objects.equals(descripcion, libro.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, descripcion);
    }

    @ManyToOne
    @JoinColumns(@JoinColumn(name = "autor_id", referencedColumnName = "id"))
    public Autor getAutoresByAutorId() {
        return autoresByAutorId;
    }

    public void setAutoresByAutorId(Autor autoresByAutorId) {
        this.autoresByAutorId = autoresByAutorId;
    }
}
