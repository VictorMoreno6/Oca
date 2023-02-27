package org.example;

public class Tablero {
    private Casilla[] tablero;

    public Casilla[] getTablero() {
        return tablero;
    }

    public void setTablero(Casilla[] tablero) {
        this.tablero = tablero;
    }

    public Tablero(){
        tablero = new Casilla[96];
        //tablero[0]=new Salida()
    }

    public Casilla devuelveCasilla(int numero){
        return tablero[numero];
    }
    public boolean hayJugador(int numero){
        boolean hay = false;
        if (tablero[numero].jugador!=null){
            hay=true;
        }
        return hay;
    }
    public void ponJugador(Jugador x,int numero){
        tablero[numero].jugador=x;
    }
    public void quitaJugador(int numero){
        tablero[numero].jugador=null;
    }

    public void mover(Jugador x, int posInicial, int posFinal){
        ponJugador(x,posFinal);
        quitaJugador(posInicial);
    }

    public boolean finJuego(){
        boolean fin=false;
        if (devuelveCasilla(95)!=null)
            if (devuelveCasilla(95).getJugador()!=null)
                fin=true;
        return fin;
    }

}
