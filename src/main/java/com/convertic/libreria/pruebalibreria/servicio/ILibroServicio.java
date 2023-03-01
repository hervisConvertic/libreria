package com.convertic.libreria.pruebalibreria.servicio;

import com.convertic.libreria.pruebalibreria.modelo.Autor;
import com.convertic.libreria.pruebalibreria.modelo.Libro;

import java.util.List;

public interface ILibroServicio {
    public Libro save(Libro libro) throws Exception;
    public List<Libro> findAll() throws Exception;
}
