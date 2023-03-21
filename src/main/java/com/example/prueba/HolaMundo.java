package com.example.prueba;

import com.example.prueba.Entidades.Persona;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class HolaMundo {
    Scanner sc = new Scanner(System.in);

    @RequestMapping("/spring-boot-taller")
    public String inicio() {
        return "<ul>" +
                "<li><a href='suma'>suma</a></li><br>" +
                "<li><a href='lista'>Arraylist</a></li><br>" +
                "</ul>";
    }

    @RequestMapping("/suma")
    public String suma() {
        System.out.println("Digite un numero");
        int num1 = sc.nextInt();
        System.out.println("Digite un numero");
        int num2 = sc.nextInt();
        int ope = num1 + num2;
        return "<a href='/spring-boot-taller'>Home</a><br>" + ope;

    }


    @RequestMapping("/lista")
    public String valor() {
        System.out.println("Ingrese su nombre");
        String nombre = sc.next();
        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();
        System.out.println("Ingrese su telefono");
        String telefono = sc.next();
        System.out.println("Ingrese su id");
        int id = sc.nextInt();
        System.out.println("Ingrese su altura");
        int altura = sc.nextInt();
        Persona user = new Persona(nombre, edad, telefono, id, altura);

        return "<a href='/spring-boot-taller'>Home</a><br>" +
                "<h2>Sus datos son: </h2><br>" +
                user;
    }
}

