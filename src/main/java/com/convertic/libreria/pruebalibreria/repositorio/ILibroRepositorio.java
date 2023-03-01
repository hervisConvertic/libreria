package com.convertic.libreria.pruebalibreria.repositorio;

import com.convertic.libreria.pruebalibreria.modelo.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILibroRepositorio extends JpaRepository<Libro,Integer> {
}
