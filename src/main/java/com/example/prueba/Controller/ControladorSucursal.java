package com.example.prueba.Controller;

import com.example.prueba.Entidades.Sucursal;
import com.example.prueba.Servicios.ServicioSucursal;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ControladorSucursal {
    ServicioSucursal sc = new ServicioSucursal();

    @GetMapping("/sucursales")
    public ArrayList<Sucursal> sucursales() {
        return sc.sucursales();
    }

    @PostMapping("/insertar-sucursal")
    public String insertar(@RequestBody Sucursal s){
        return sc.agregarSucursal(s);
    }

    @GetMapping("/buscarSucursal/{datos}")
    public ArrayList<Sucursal> buscar(@PathVariable("datos") String json){
        return sc.buscarSucursal(json);
    }

    @GetMapping("/eliminarSucursal/{cod}")
    public String eliminar(@PathVariable("cod") int codigo) {
        return sc.eliminarSucursal(codigo);
    }

    @GetMapping("/actualizarSucursal/{Suc}")
    public String actualizar(@PathVariable("Suc") String jsonuser){
        return sc.actualizarSucursal(jsonuser);
    }
}
