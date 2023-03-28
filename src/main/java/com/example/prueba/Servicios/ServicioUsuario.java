package com.example.prueba.Servicios;

import com.example.prueba.Entidades.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;

public class ServicioUsuario {

<<<<<<< HEAD
    ArrayList<Usuario> lista= new ArrayList<>();
=======
    public ServicioUsuario() {
        lista.add(new Usuario(6,"Camilo","Peru", LocalDate.of(2023,02,28),"camilo@gmail.com"));
        lista.add(new Usuario(7,"Anastacio","Lima", LocalDate.of(2022,06,10),"Anas@gmail.com"));
        lista.add(new Usuario(8,"Federico","Mexico", LocalDate.of(2021,03,07),"Feder@gmail.com"));
>>>>>>> b799d779f4a74b2a31a1f7eee8e90866c92459f5

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
<<<<<<< HEAD
        Usuario u=new Usuario();
        for(Usuario us: lista){
            if(u.getId() == codigo ){
                u=us;
            }
        }
        return u;
    }


=======
        Usuario u = new Usuario();
        for (Usuario us : lista){
            if (u.getId() == codigo){
                u=us;
            }
        }return u;
    }
>>>>>>> b799d779f4a74b2a31a1f7eee8e90866c92459f5
}
