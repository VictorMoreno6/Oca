package org.example;

public class Atajo extends Casilla{
    public Atajo(int numero) {
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

    /*public void moverAtajo(Tablero t,Jugador x){

        for (int i = 0; i < 95; i++) {
            if (t.devuelveCasilla(i).getClass().getSimpleName().equalsIgnoreCase("Atajo"))
        }
    }*/
}
