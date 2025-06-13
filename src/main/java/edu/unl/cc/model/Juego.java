package edu.unl.cc.model;

import java.util.Random;
import java.util.Scanner;

public class Juego {

    public void juego_azar() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int jugador, rondas = 0, rival = 0;
        int ganar = 3;
        do {
            int x = rand.nextInt(3);
            System.out.println("1 piedra ");
            System.out.println("2 papel ");
            System.out.println("3 tijera ");
            jugador = sc.nextInt();
            switch (jugador) {
                case 1:
                    if (jugador == x) {
                        System.out.println("EMPATE AMBOS SON DE JUEGO PIEDRA NINGUN PUNTO ");
                    } else if (x == 2) {
                        rival++;
                        System.out.println("JUGADOR PIERDE PAPEL VENCE A PIEDRA PUNTO PARA EL RIVAL");
                    } else {
                        rondas++;
                        System.out.println("JUGADOR GANA RONDA PIEDRA VENCE A TIJERAS ");
                    }
                    break;
                case 2:
                    if (jugador == x) {
                        System.out.println("EMPATE AMBOS SON DE JUEGO PAPEL NINGUN PUNTO ");
                    } else if (x == 1) {
                        rondas++;
                        System.out.println("JUGADOR GANA PAPEL VENCE A PIEDRA PUNTO PARA EL JUGADOR ");
                    } else {
                        rival++;
                        System.out.println("JUGADOR PIERDE TIJERA VENCE A PAPEL PUNTO PARA EL RIVAL ");
                    }
                    break;
                case 3:
                    if (jugador == x) {
                        System.out.println("EMPATE AMBOS SON DE JUEGO TIJERA NINGUN PUNTO ");
                    } else if (x == 2) {
                        rondas++;
                        System.out.println("JUGADOR GANA TIJERA VENCE A PAPEL PUNTO PARA EL JUGADOR");
                    } else {
                        rival++;
                        System.out.println("JUGADOR PIERDE PIEDRA VENCE A TIJERA PUNTO PARA EL RIVAL");
                    }
                    break;
                default:
                    System.out.println("ERROR OPCION NO VALIDA");
                    break;
            }

        } while (rondas < 3 && rival < 3);
        {
            if (rondas == 3) {
                System.out.println("JUGADOR GANA " + rondas + " a " + rival);
            } else {
                System.out.println("RIVAL GANA " + rival + " a " + rondas);
            }
        }
    }

    public int calcularMCM(int num1, int num2) {
        int max = num1 * num2;

        for (int i = Math.max(num1, num2); i <= max; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                return i;
            }
        }
        return max;
    }

    public int raizCubica(int numero) {
        int result = 0;
        while (result * result * result < numero) {
            result++;
        }
        if (result * result * result == numero) {
            return result;
        } else {
            return -1;
        }
    }

}
