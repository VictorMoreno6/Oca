package org.example;

public class Salida extends Casilla{
    public Salida(int numero) {
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
