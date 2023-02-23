package org.example;

public class Dado {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int LanzarDado(){
        numero= (int) ((Math.random()*20)+1);
        return numero;
    }

    public Dado (){
        numero = 0;
    }
}
