package com.example.prueba.Servicios;

import com.example.prueba.Entidades.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;

public class ServicioUsuario {

    ArrayList<Usuario> lista= new ArrayList<>();

    public ServicioUsuario(){
        lista.add(new Usuario(10,"luisa",LocalDate.of(2023,2,28),"luisa@gmail.com","Colombia"));
        lista.add(new Usuario(10,"santiago",LocalDate.of(2022,04,26),"santiago@gmail.com","Venezuela"));
        lista.add(new Usuario(10,"javier",LocalDate.of(2020,05,27),"javier@gmail.com","España"));
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
