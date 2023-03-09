package com.example.prueba.Servicios;

import com.example.prueba.Entidades.Productos;

import java.util.ArrayList;

public class ServicioProductos {

    private ArrayList<Productos> lista = new ArrayList<Productos>();

    public ServicioProductos() {
        lista.add(new Productos(1,"Manzana", 500, 12, 0,"Fruta"));
        lista.add(new Productos(2,"Papas", 1500, 2, 0,"Procesados"));
        lista.add(new Productos(3,"Zanahora", 900, 14, 0,"Vegetal"));
        lista.add(new Productos(4,"Pera", 800, 4, 0,"Fruta"));
        lista.add(new Productos(5,"Bombomboom", 500, 6, 0,"Dulce"));
    }

    public ArrayList<Productos> mostrar() {
        return lista;
    }

    public int cantidad() {
        return lista.size();
    }

    public double cantidaTotal() {
        ArrayList<Double> totales = new ArrayList<Double>();
        mostrar().forEach(productos -> {
            totales.add(productos.getTotal());
        });

        double total = 0;
        for(Double i: totales){
            total += i;
        }
        return total;
    }
}
