package com.example.prueba.Controller;


import com.example.prueba.Entidades.Usuario;
import com.example.prueba.Servicios.ServicioUsuario;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class controladorUsuario {
    ServicioUsuario servicio=new ServicioUsuario();

    @GetMapping("/ListarUsuario")
    public ArrayList<Usuario> listarUsuario(){
        return servicio.listar();
    }
}
