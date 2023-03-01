package com.convertic.libreria.pruebalibreria.servicio;

import com.convertic.libreria.pruebalibreria.modelo.Libro;
import com.convertic.libreria.pruebalibreria.repositorio.ILibroRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LibroServicio implements ILibroServicio{
    private ILibroRepositorio iLibroRepositorio;

    public LibroServicio(ILibroRepositorio iLibroRepositorio) {
        this.iLibroRepositorio = iLibroRepositorio;
    }

    @Override
    public Libro save(Libro libro) throws Exception {
        try {
            libro=iLibroRepositorio.save(libro);
            return libro;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Libro> findAll() throws Exception {
        try {
            List<Libro> libros=iLibroRepositorio.findAll();
            return libros;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
