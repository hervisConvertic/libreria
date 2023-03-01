package com.convertic.libreria.pruebalibreria.servicio;

import com.convertic.libreria.pruebalibreria.modelo.Autor;
import com.convertic.libreria.pruebalibreria.repositorio.IAutorRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AutorServicio implements IAutorServicio{
   private IAutorRepositorio iAutorRepositorio;

    public AutorServicio(IAutorRepositorio iAutorRepositorio) {
        this.iAutorRepositorio = iAutorRepositorio;
    }

    @Override
    public Autor save(Autor autor) throws Exception {
        try {
            autor=iAutorRepositorio.save(autor);
            return autor;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Autor> findAll() throws Exception {
        try {
            List<Autor> autores=iAutorRepositorio.findAll();
            return autores;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
