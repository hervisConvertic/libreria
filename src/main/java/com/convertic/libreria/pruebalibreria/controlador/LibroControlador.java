package com.convertic.libreria.pruebalibreria.controlador;

import com.convertic.libreria.pruebalibreria.modelo.Libro;
import com.convertic.libreria.pruebalibreria.servicio.LibroServicio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LibroControlador {
    private LibroServicio libroServicio;

    public LibroControlador(LibroServicio libroServicio) {
        this.libroServicio = libroServicio;
    }
    @PostMapping("/registroLibro")
    public ResponseEntity<?> save(@RequestBody Libro libro) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(libroServicio.save(libro));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"Error\":\"Error. por favor intente mas tarde.\"}");
        }
    }
    @GetMapping("/verLibro")
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(libroServicio.findAll());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"Error\":\"Error. por favor intente mas tarde.\"}");
        }
    }
}
