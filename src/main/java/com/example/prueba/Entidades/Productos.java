package com.example.prueba.Entidades;

public class Productos {
    private int codigo;
    private String nombre;
    private double precio;
    private int cantidadStock;
    private double total;
    private String cotegoria;

    public Productos(int codigo, String nombre, double precio, int cantidadStock, double total, String cotegoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
        this.total = total;
        this.cotegoria = cotegoria;
    }

    public Productos() {

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public double getTotal() {
        total = cantidadStock * precio;
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCotegoria() {
        return cotegoria;
    }

    public void setCotegoria(String cotegoria) {
        this.cotegoria = cotegoria;
    }

    @Override
    public String toString() {
        return " -nro=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidadStock=" + cantidadStock +
                ", total=" + total +
                ", cotegoria='" + cotegoria +
                "<br>";
    }
}
