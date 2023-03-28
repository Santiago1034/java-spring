package com.example.prueba.Controller;

import com.example.prueba.Entidades.Administrador;
import com.example.prueba.Servicios.ServicioAdmi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;


public class ControladorAdmi {
    ServicioAdmi sa = new ServicioAdmi();

    @GetMapping("/Administradores")
    public String listar() {
        return "<a href='/'>Home</a><br>" + sa.mostrar();
    }

    @GetMapping("/cantidad")
    public String cantidad() {
        return "<a href='/'>Home</a><br><p>Cantidad de administradores: </p>" + sa.cantidad();
    }

    @GetMapping("/addAdmin")
    public String insertar(@RequestBody Administrador admi){
        return sa.addAdmi(admi);
    }

    @GetMapping("/buscarAdmin")
    public String buscar(@RequestBody Administrador admi){
        return sa.buscarAdmin(admi);
    }

    @GetMapping("/actualizarAdmin")
    public String actualizar(@RequestBody Administrador admi){
        return sa.actualizarAdmin(admi);
    }

    @GetMapping("/eliminarAdmin")
    public String eliminar(@RequestBody Administrador admi){
        return sa.eliminarAdmin(admi);
    }


}
