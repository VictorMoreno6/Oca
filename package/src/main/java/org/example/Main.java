package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tablero tablero=new Tablero();
        Juego juego= new Juego();
        int n=0;
        System.out.println("Introduce el nombre del jugador 1");
        Jugador jugador1=new Jugador(sc.next(),0);
        System.out.println("Introduce el nombre del jugador 2");
        Jugador jugador2=new Jugador(sc.next(),0);
        boolean parar=false;
        do {
            System.out.println("Jugador1: " + jugador1.getNombre() + ", casilla " + jugador1.getNumero());
            System.out.println("Jugador2: " + jugador2.getNombre() + ", casilla " + jugador2.getNumero());
            if (juego.isElTurno()==false){
                System.out.println("Es el turno de " + jugador1.getNombre());
            } else {
                System.out.println("Es el turno de " + jugador2.getNombre());
            }
            System.out.println("¿Desea continuar?");
            String respuesta=sc.next();
            char respuesta1=respuesta.charAt(0);
            if (respuesta1=='s'){
                System.out.println("jeded");
            } else if (respuesta.charAt(0)=='n') {
                System.out.println("Has perdido la partida");
                parar=true;
            } else {
                System.out.println("Asegurese de escribir la letra correctamente");
            }
        }while (!tablero.finJuego() || !parar);
    }
}