package com.example.prueba.Controller;

import com.example.prueba.Servicios.ServicioSucursal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorSucursal {
    ServicioSucursal sc = new ServicioSucursal();

    @RequestMapping("/sucursales")
    public String sucursales() {
        return "<a href='/'>Home</a><br>" +sc.Sucursales();
    }
}
