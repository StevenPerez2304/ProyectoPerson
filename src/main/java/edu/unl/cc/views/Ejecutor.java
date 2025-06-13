package edu.unl.cc.views;

import edu.unl.cc.model.Juego;

public class Ejecutor {

    public static void main(String[] args) {
        Juego juego = new Juego();
        System.out.println("Juego de piedra, papel, tijera");
        juego.juego_azar();

    }
}
