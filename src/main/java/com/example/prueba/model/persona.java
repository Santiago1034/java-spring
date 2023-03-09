package com.example.prueba.model;

public class persona {
    private String nombre;
    private int edad;
    private int telefono;
    private int id;
    private int altura;

    public persona(String nombre, int edad, int telefono, int id, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.id = id;
        this.altura = altura;
    }

    public persona() {
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
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

