package org.example;

public class Jugador {
    private String nombre;

    private Casilla casilla;

    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Casilla getCasilla() {
        return casilla;
    }

    public void setCasilla(Casilla casilla) {
        this.casilla = casilla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Jugador(String nombre){
        this.nombre=nombre;
    }
    public Jugador(String nombre, int numero){
        this.nombre=nombre;
        numero=0;
    }
}
