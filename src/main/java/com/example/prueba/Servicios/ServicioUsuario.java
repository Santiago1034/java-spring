package com.example.prueba.Servicios;

import com.example.prueba.Entidades.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;

public class ServicioUsuario {
    ArrayList<Usuario> lista = new ArrayList<Usuario>();

    public ServicioUsuario() {
        lista.add(new Usuario(06,"Camilo","Peru", LocalDate.of(2023,02,28),"camilo@gmail.com"));
        lista.add(new Usuario(07,"Anastacio","Lima", LocalDate.of(2022,06,10),"Anas@gmail.com"));
        lista.add(new Usuario(8,"Federico","Mexico", LocalDate.of(2021,03,07),"Feder@gmail.com"));

    }

    public ArrayList<Usuario> usuarios() {
        return lista;
    }

    public String agregarUsuario(Usuario u) {
        lista.add(u);
        return "Registro exitoso";
    }

    public Usuario buscarUsuario(int codigo){
        Usuario u=new Usuario();
        for(Usuario us: lista){
            if(u.getId() == codigo ){
                u=us;
            }
        }
        return u;
    }

}
