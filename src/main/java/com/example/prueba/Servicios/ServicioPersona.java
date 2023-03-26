package com.example.prueba.Servicios;

import com.example.prueba.Entidades.Persona;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioPersona {

    ArrayList<Persona> lista = new ArrayList<>();

    public ServicioPersona() {
        lista.add(new Persona("santiago", 18, "30231", 177, 4));
    }

    public ArrayList<Persona> personas() {
        return lista;
    }

    public String agregarPersona(Persona p) {
        lista.add(p);
        return "Registro exitoso";
    }

    public String eliminarPersona(int codigo) {
        String mensaje = "no existe esta persona" + codigo;
        for(Persona pe : lista){
            if (pe.getId() == codigo){
                lista.remove(pe);
                mensaje = "Eliminacion exitosa";
            }
        }
        return mensaje;

    }

    public Persona buscarPersona(int codigo) {
        Persona prn =null;

        for (Persona p : lista) {
            if(p.getId() == codigo){
                prn = p;
            }
        }
        return prn;
    }


}