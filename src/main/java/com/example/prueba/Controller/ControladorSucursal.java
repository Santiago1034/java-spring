package com.example.prueba.Controller;

import com.example.prueba.Entidades.Sucursal;
import com.example.prueba.Servicios.ServicioSucursal;
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
}
