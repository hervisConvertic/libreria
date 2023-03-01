package com.convertic.libreria.pruebalibreria.repositorio;

import com.convertic.libreria.pruebalibreria.modelo.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAutorRepositorio extends JpaRepository<Autor,Integer> {
}
