package com.example.prueba.Servicios;

import com.example.prueba.Entidades.Sucursal;
import com.example.prueba.Entidades.Usuario;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;

import java.util.ArrayList;

public class ServicioSucursal {
    ArrayList<Sucursal> lista = new ArrayList<Sucursal>();
    ArrayList<Sucursal> mostrar = new ArrayList<>();

    public ServicioSucursal() {
        lista.add(new Sucursal(1, "cll 5ta c nro.20-24", "madrid", "3108765350", "julicmilo@gmail.com"));
        lista.add(new Sucursal(2, "cll 6ta c nro.20-24", "madrid", "3108765350", "julicmilo@gmail.com"));
        lista.add(new Sucursal(3, "cll 7ta c nro.20-24", "madrid", "3108765350", "julicmilo@gmail.com"));
    }

    public ArrayList<Sucursal> sucursales() {
        return lista;
    }

    public String agregarSucursal(Sucursal s) {
        lista.add(s);
        return "Registro Exitoso";
    }

    public ArrayList<Sucursal> buscarSucursal(String json) {
        JsonNode node = null;
        ObjectMapper mapper = new ObjectMapper();
        String search = null;
        mostrar.clear();
        try {
            node = mapper.readTree(json);
            System.out.println(node);
                if (node.get("tipo").asText().equals("codigo")){
                    for(Sucursal u: lista) {
                        if (u.getCodigo() == node.get("dato").asInt()) {
                            mostrar.add(u);
                        }
                    }
                } else if (node.get("tipo").asText().equals("direccion")) {
                    for(Sucursal u: lista) {
                        if (u.getDireccion().equals(node.get("dato").asText())) {
                            mostrar.add(u);
                        }
                    }
                } else if (node.get("tipo").asText().equals("ciudad")){
                    for(Sucursal u: lista) {
                        if (u.getCiudad().equals(node.get("dato").asText())) {
                            mostrar.add(u);
                        }
                    }
                } else if (node.get("tipo").asText().equals("telefono")){
                    for(Sucursal u: lista) {
                        if (u.getTelefono().equals(node.get("dato").asText())) {
                            mostrar.add(u);
                        }
                    }
                } else if (node.get("tipo").asText().equals("correo")){
                    for(Sucursal u: lista) {
                        if (u.getCorreo().equals(node.get("dato").asText())) {
                            mostrar.add(u);
                        }
                    }
                }
        }catch (JsonProcessingException e){
            e.printStackTrace();
        }
        return mostrar;
    }

    public String actualizarSucursal(String json) {
        String mensaje = "No se actualizo el producto";
        JsonNode node = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            node = mapper.readTree(json);
            System.out.println(node);
            for (Sucursal u: lista){
                if (u.getCodigo() == node.get("codigo").asInt()){
                    Sucursal s = new Sucursal(node.get("codigo").asInt(),node.get("direccion").asText(),node.get("ciudad").asText(),node.get("telefono").asText(),node.get("correo").asText());
                    lista.remove(u);
                    lista.add(s);
                }
            }
            mensaje = "Se actualizo el producto";
        }catch (JsonProcessingException e) {
            mensaje = "error al actualizar el producto " + e;
            e.printStackTrace();
        }

        return mensaje;
    }

    public String eliminarSucursal(int Codigo) {
        String mensaje = "No se encontro el producto con el codigo " + Codigo;
        for (Sucursal u : lista) {
            if (u.getCodigo() == Codigo) {
                lista.remove(u);
                mensaje = "Se elimino el producto con el codigo " + Codigo;
                break;
            }
        }
        return mensaje;
    }
}
