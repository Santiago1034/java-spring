package com.example.prueba.Controller;

import com.example.prueba.Entidades.Productos;
import com.example.prueba.Servicios.ServicioProductos;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ControladorProductos {
    ServicioProductos sp = new ServicioProductos();

    @GetMapping("/")
    public String home() {
        return "<ul><li><a href='productos'>Listado de productos</a></li>"+
                "<li><a href='cantidad-productos'>Cantidad productos</a></li>"+
                "<li><a href='total-productos'>Precio total</a></li>" +
                "<li><a href='lista-usuarios'>Usuarios</a></li>" +
                "<li><a href='sucursales'>Sucursales</a></li>";
    }

    @GetMapping("/productos")
    public String listar() {
        return "<a href='/'>Home</a><br>" + sp.mostrar();
    }

    @GetMapping("/cantidad-productos")
    public String cantidad() {
        return "<a href='/'>Home</a><br><p>Cantidad de productos: </p>" + sp.cantidad();
    }

    @GetMapping("/total-productos")
    public String total() {
        return "<a href='/'>Home</a><br>"+
                "<p>Precio total:</p>" + sp.cantidaTotal();
    }
}
