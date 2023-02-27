package org.example;

public class Fin extends Casilla{
    public Fin(int numero) {
        super(numero);
    }

    @Override
    public boolean funcion(Tablero t) {
        boolean caer=false;
        if (jugador!=null){
            caer=true;
        }
        return caer;
    }
}
