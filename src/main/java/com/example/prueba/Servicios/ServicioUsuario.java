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

    public ArrayList<Usuario> listar(){
        return lista;
    }
}
