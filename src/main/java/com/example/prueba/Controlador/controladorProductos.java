package com.example.prueba.Controlador;


import com.example.prueba.Entidades.Productos;
import com.example.prueba.Servicios.servicioProductos;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class controladorProductos {

    servicioProductos servicio= new servicioProductos();

    @GetMapping("/listaProductos")
    public ArrayList<Productos> lista(){
        return servicio.mostrar();

    }

}
