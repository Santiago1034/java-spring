package com.example.prueba.Servicios;


import com.example.prueba.Entidades.Administrador;

import java.util.ArrayList;


public class ServicioAdmi {
    private ArrayList<Administrador> list = new ArrayList<>();
    public ServicioAdmi(){
        list.add(new Administrador(1,"Camilo", "Australia", "20-09-2021", "andres@gmail.com"));
    }
    public ArrayList<Administrador> mostrar() {
        return list;
    }

    public int cantidad() {
        return list.size();
    }

    public String addAdmi(Administrador sa){
        list.add(sa);
        return "Return Exitoso";
    }
    public String buscarAdmin(Administrador sa){
        var search = "";
        var mensaje = "";
        for(var i=0;i< list.size();){
            if(search.equals(sa.getNombre())){
                 mensaje =  "Return Exitoso";
            }else{
                 mensaje =  "Administrador no encontrado";
            }
        }
        return mensaje;
    }
    public String actualizarAdmin(Administrador sa){
        var searchID = 0;
        var mensaje = "";
        for(var i=0;i< list.size();){
            if(searchID == sa.getId()){

                mensaje =  "Return Exitoso";

            }else{
                mensaje =  "Administrador no encontrado";
            }
        }
        return mensaje;
    }

    public String eliminarAdmin(Administrador sa){
        list.add(sa);
        return "Return Exitoso";
    }




}
