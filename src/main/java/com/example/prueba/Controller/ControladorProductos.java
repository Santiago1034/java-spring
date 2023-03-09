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
    public String listar() {
        return "<a href='/'>Home</a><br>" + sp.mostrar();
    }

    @GetMapping("/cantidad")
    public String cantidad() {
        return "<a href='/'>Home</a><br><p>Cantidad de productos: </p>" + sp.cantidad();
    }

    @GetMapping("/cantidadtotal")
    public String total() {
        return "<a href='/'>Home</a><br>"+
                "<p>Precio total:</p>" + sp.cantidaTotal();
    }
}
