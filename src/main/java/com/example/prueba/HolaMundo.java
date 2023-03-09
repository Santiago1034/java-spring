package com.example.prueba;

import com.example.prueba.model.persona;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.*;

@RestController
public class HolaMundo {
    Scanner sc = new Scanner(System.in);

    @RequestMapping("/")
    public String home() {
        return "<a href='suma'>suma<a><br>" +
                "<a href='lista'>Arraylist<a>";
    }

    @RequestMapping("/suma")
    public String suma() {
        System.out.println("Digite un numero");
        int num1 = sc.nextInt();
        System.out.println("Digite un numero");
        int num2 = sc.nextInt();
        int ope = num1 + num2;
        return "<a href='/'>Home<a><br>" + ope;

    }


    @RequestMapping("/lista")
    public String valor() {
        System.out.println("Ingrese su nombre");
        String nombre = sc.next();
        int edad = sc.nextInt();
        int telefono = sc.nextInt();
        int id = sc.nextInt();
        int altura = sc.nextInt();
        persona user = new persona(nombre, edad, telefono, id, altura);

        return "<a href='/'>Home</a><br>" +
                "<h2>Sus datos son: </h2><br>" +
                user;
    }
}

