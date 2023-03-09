package com.example.prueba;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.*;

@RestController
public class HolaMundo {

    @RequestMapping("/")
    public String home() {
        return "<a href='suma'>suma<a><br>"+
                "<a href='lista'>Arraylist<a>";
    }

    @RequestMapping("/suma")
    public String suma(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un numero");
        int num1 = sc.nextInt();
        System.out.println("Digite un numero");
        int num2 = sc.nextInt();
        int ope = num1 + num2;
        return "<a style='color:black' href='/'>Home<a>" + ope;

    }


    @RequestMapping("/lista")
        public String valor(){
        
        }
    }

