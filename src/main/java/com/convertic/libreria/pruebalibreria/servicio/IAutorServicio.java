package com.convertic.libreria.pruebalibreria.servicio;

import com.convertic.libreria.pruebalibreria.modelo.Autor;

import java.util.List;


public interface IAutorServicio {
    public Autor save(Autor autor) throws Exception;
    public List<Autor> findAll() throws Exception;
}
