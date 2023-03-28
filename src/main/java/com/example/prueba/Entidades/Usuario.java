package com.example.prueba.Entidades;

import java.time.LocalDate;

public class Usuario {
<<<<<<< HEAD

    private int id;
    private String nombre;

    private LocalDate fecha;

    private String correo;
    private String pais;


    public Usuario(int is, String nombre, LocalDate fecha, String correo, String pais) {
        this.id = is;
        this.nombre = nombre;
        this.fecha = fecha;
        this.correo = correo;
        this.pais = pais;
    }


=======
    private int id;
    private String nombre;
    private String pais;
    private LocalDate fecha;
    private String correo;

>>>>>>> b799d779f4a74b2a31a1f7eee8e90866c92459f5
    public Usuario(int id, String nombre, String pais, LocalDate fecha, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.fecha = fecha;
        this.correo = correo;
    }

    public Usuario() {

    }

<<<<<<< HEAD
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;

    }

    public String getNombre() {
        return nombre;
    }
=======
    public int getId() {
        return id;
    }

    public void setId(int id) {this.id = id;}
>>>>>>> b799d779f4a74b2a31a1f7eee8e90866c92459f5

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
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



    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", fecha=" + fecha +
                ", correo='" + correo + '\'' +
                '}';

    }
}
