package com.example.prueba.Entidades;

public class Persona {
    private String nombre;
    private int edad;
    private String telefono;
    private int id;
    private int altura;

    public Persona(String nombre, int edad, String telefono, int id, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.id = id;
        this.altura = altura;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                "<br> edad=" + edad +
                "<br> telefono=" + telefono +
                "<br> id=" + id +
                "<br> altura=" + altura ;
    }

}

