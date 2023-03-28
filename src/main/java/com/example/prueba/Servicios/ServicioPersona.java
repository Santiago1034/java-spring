package com.example.prueba.Servicios;

import com.example.prueba.Entidades.Persona;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioPersona {

    ArrayList<Persona> lista = new ArrayList<>();

    public ServicioPersona() {
        lista.add(new Persona("santiago", 18, "30231", 177, 4));
    }

    public ArrayList<Persona> personas() {
        return lista;
    }

    public String agregarPersona(Persona p) {
        lista.add(p);
        return "Registro exitoso";
    }

    public String eliminarPersona(int codigo) {
        String mensaje = "no existe esta persona" + codigo;
        for (Persona pe : lista) {
            if (pe.getId() == codigo) {
                lista.remove(pe);
                mensaje = "Eliminacion exitosa";
            }
        }
        return mensaje;

    }

    public Persona buscarPersona(int codigo) {
        Persona prn = null;

        for (Persona p : lista) {
            if (p.getId() == codigo) {
                prn = p;
            }
        }
        return prn;
    }

    public String actualizarPersona(String json, int codigo) {
        String mensaje = "No se actualizo la persona";
        JsonNode node = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            node = mapper.readTree(json);
            System.out.println(node);
            for (Persona pa : lista) {
                if (pa.getId() == codigo) {
                    Persona pn = new Persona(node.get("nombre").asText(), node.get("edad").asInt(), node.get("telefono").asText(), node.get("id").asInt(), node.get("altura").asInt());
                    lista.remove(pa);
                    lista.add(pn);
                    break;
                }
            }

            mensaje = "Se actualizo la persona";
        } catch (JsonProcessingException e) {
            mensaje = "error al actualizar" + e;
            e.printStackTrace();
        }

        return mensaje;
    }


}

