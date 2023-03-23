package com.example.prueba.Entidades;

import java.time.LocalDate;

public class Usuario {
<<<<<<< HEAD
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
=======
    private int id;
    private String nombre;
    private String pais;
    private LocalDate fecha;
    private String correo;

    public Usuario(Integer id, String nombre, String pais, LocalDate fecha, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.fecha = fecha;
        this.correo = correo;
    }

    public Usuario() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
>>>>>>> 5b3114aa0f459edb787093a227264445cbd2c957
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

<<<<<<< HEAD
=======
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

>>>>>>> 5b3114aa0f459edb787093a227264445cbd2c957
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

<<<<<<< HEAD
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
=======
    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", fecha=" + fecha +
                ", correo='" + correo + '\'' +
                '}';
>>>>>>> 5b3114aa0f459edb787093a227264445cbd2c957
    }
}
