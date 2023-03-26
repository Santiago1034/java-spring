package com.example.prueba.Servicios;

import com.example.prueba.Entidades.Sucursal;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

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
            System.out.println(e);
        }
        return mostrar;
    }

    public String actualizarSucursal(int codigo, Sucursal s) {
        String mensaje = "No se actualizo la sucursal";
        for (Sucursal S:lista){
            if (S.getCodigo() == codigo){
                lista.remove(S);
                lista.add(s);
                mensaje = "La sucursal con el codigo " + codigo + " se acutalizo correctamente";
                break;
            }
        }
        return mensaje;
    }

    public String eliminarSucursal(int Codigo) {
        String mensaje = "No se encontro la sucursal con el codigo " + Codigo;
        for (Sucursal u : lista) {
            if (u.getCodigo() == Codigo) {
                lista.remove(u);
                mensaje = "Se elimino la sucursal con el codigo " + Codigo;
                break;
            }
        }
        return mensaje;
    }
}
