package com.example.prueba.Controller;

import com.example.prueba.Entidades.Productos;
import com.example.prueba.Servicios.ServicioProductos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ControladorProductos {
    ServicioProductos sp = new ServicioProductos();

    @GetMapping("/listado")
    public ArrayList<Productos> listar() {
        return sp.mostrar();
    }

}
