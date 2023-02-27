package org.example;

public class Bici extends Casilla{
    public Bici(int numero) {
        super(numero);
    }

    public boolean funcion(Tablero t) {
        boolean caer=false;
        if (jugador!=null){
            caer=true;
        }
        return caer;
    }
}
