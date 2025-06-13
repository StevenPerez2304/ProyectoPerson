package edu.unl.cc.views;

import edu.unl.cc.model.Juego;

import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Juego juego = new Juego();
        //System.out.println("Juego de piedra, papel, tijera");
        //juego.juego_azar();
        int numero1, numero2;
        System.out.println("Ingrese el numero de la posicion 1:");
        numero1 = sc.nextInt();
        //System.out.println("Ingrese el numero de la posicion 2:");
       // numero2 = sc.nextInt();
        //System.out.println("el multiplo es " + juego.calcularMCM(numero1, numero2));
        numero2 = juego.raizCubica(numero1);
        if (numero2 != -1) {
            System.out.println("La raíz cúbica de " + numero1 + " es: " + numero2);
        } else {
            System.out.println(numero1 + " no tiene raíz cúbica exacta.");
        }

    }
}
