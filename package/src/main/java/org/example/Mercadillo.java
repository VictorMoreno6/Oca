package org.example;

public class Mercadillo extends Casilla{
    public Mercadillo(int numero) {
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
