package com.example.prueba.Entidades;

public class Administrador {
    private int id;
    private String nombre;
    private String pais;
    private String fechaNac;
    private String correo;

    public Administrador(int id, String nombre, String pais, String fechaNac, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.fechaNac = fechaNac;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", fechaNac='" + fechaNac + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
