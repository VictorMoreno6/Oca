package org.example;

public class Juego {
    public boolean elTurno;

    public boolean isElTurno() {
        return elTurno;
    }

    public void setElTurno() {
        if (elTurno==false){
            elTurno=true;
        } else {
            elTurno=false;
        }
    }

    public Juego(){
        elTurno=false;
    }

    public void Jugada(Jugador ju,Tablero tab){

    }
}
