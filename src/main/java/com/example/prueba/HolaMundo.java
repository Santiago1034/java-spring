package com.example.prueba;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.*;

@RestController
public class HolaMundo {


    @RequestMapping("/suma")
    public int suma(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un numero");
        int num1 = sc.nextInt();
        System.out.println("Digite un numero");
        int num2 = sc.nextInt();
        int ope = num1 + num2;
        return ope;

    }


    @RequestMapping("/lista")
        public  ArrayList valor(){
            int n=0;
            Scanner sc = new Scanner(System.in);
            ArrayList ar = new ArrayList();
            System.out.println("digite el tamaño");
            int tam = sc.nextInt();
            while (n<tam){
                System.out.println("Digite un numero");
                int num1 = sc.nextInt();
                System.out.println("Digite un numero");
                int num2 = sc.nextInt();
                int ope = num1 + num2;
                ar.add(ope);
                n=n+1;
            }
            return ar;
        }
    }

