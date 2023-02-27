package org.example;

public abstract class Casilla {
    protected int numero;

    protected Jugador jugador;

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Casilla(int numero){
        this.numero=numero;
        //jugador=null;
    }

    public Casilla(){
        numero=0;
    }

    /*public Casilla(int numero,Jugador jugador){
        this.numero=numero;
        this.jugador=jugador;
    }*/
    abstract public boolean funcion(Tablero t);
}
