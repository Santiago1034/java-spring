package com.example.prueba.Controller;

import com.example.prueba.Entidades.Usuario;
import com.example.prueba.Servicios.ServicioUsuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ControladorUsuario {
    ServicioUsuario u = new ServicioUsuario();

    @GetMapping("/lista-usuarios")
    public ArrayList<Usuario> listar() {
        return u.usuarios();
    }

    @PostMapping("/insertar-usuario")
    public String insertar(@RequestBody Usuario user) {
        return u.agregarUsuario(user);
    }

    @GetMapping("/buscarUsuario/{cod}")
<<<<<<< HEAD
    public  Usuario buscarUsuario(@PathVariable("cod") int codigo){
        return u.buscarUsuario(codigo);
    }
=======
        public Usuario buscarUsuario(@PathVariable("cod")int codigo){
        return u.buscarUsuario(codigo);
    }

>>>>>>> b799d779f4a74b2a31a1f7eee8e90866c92459f5
}
