package com.example.prueba.Servicios;

import com.example.prueba.Entidades.Sucursal;

import java.util.ArrayList;

public class ServicioSucursal {
    ArrayList<Sucursal> lista = new ArrayList<Sucursal>();

    public ServicioSucursal() {
        lista.add(new Sucursal(1,"cll 5ta c nro.20-24", "madrid", "3108765350", "julicmilo@gmail.com"));
    }

    public ArrayList<Sucursal> Sucursales(){
        return lista;
    }
}
