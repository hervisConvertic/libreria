package com.convertic.libreria.pruebalibreria.controlador;

import com.convertic.libreria.pruebalibreria.modelo.Autor;
import com.convertic.libreria.pruebalibreria.servicio.AutorServicio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AutorControlador {
    private AutorServicio autorServicio;

    public AutorControlador(AutorServicio autorServicio) {
        this.autorServicio = autorServicio;
    }

    @PostMapping("/registrarautor")
    public ResponseEntity<?> save(@RequestBody Autor autor) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(autorServicio.save(autor));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"Error\":\"Error. por favor intente mas tarde.\"}");
        }
    }
    @GetMapping("/verAutor")
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(autorServicio.findAll());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"Error\":\"Error. por favor intente mas tarde.\"}");
        }
    }



}
