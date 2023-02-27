package org.example;

public class DrogasNo extends Casilla{
    public DrogasNo(int numero) {
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
