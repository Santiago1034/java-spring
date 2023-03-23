package com.example.prueba.Controller;

import com.example.prueba.Entidades.Persona;
import com.example.prueba.Servicios.ServicioPersona;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

public class ControladorPersona {
    ServicioPersona sp = new ServicioPersona();
    @GetMapping("/personas")
    public ArrayList<Persona> lista(){
        return sp.personas();
    }

    @PostMapping("/agregar-persona")
    public String agregar(@RequestBody Persona p) {
        return sp.agregarPersona(p);
    }

    @DeleteMapping("/eliminar-persona/{cod}")
    public String eliminar(@PathVariable("cod") int codigo) {
        return sp.eliminarPersona(codigo);
    }

    @GetMapping("/buscar-persona/{cod}")
    public Persona buscar(@PathVariable("cod") int codigo ){
        return sp.buscarPersona(codigo);
    }
}
