package com.example.prueba.Entidades;

import java.time.LocalDate;

public class Usuario {
    private int is;
    private String nombre;

    private LocalDate fecha;

    private String correo;
    private String pais;


    public Usuario(int is, String nombre, LocalDate fecha, String correo, String pais) {
        this.is = is;
        this.nombre = nombre;
        this.fecha = fecha;
        this.correo = correo;
        this.pais = pais;
    }

    public int getIs() {
        return is;
    }

    public void setIs(int is) {
        this.is = is;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
