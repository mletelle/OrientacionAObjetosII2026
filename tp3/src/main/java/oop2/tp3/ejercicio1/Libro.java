package oop2.tp3.ejercicio1;

public abstract class Libro {
    private String nombre;

    public Libro(String nombre) {
        this.nombre = nombre;
    }

    abstract double calcularMonto(int dias);

    abstract int calcularPuntos(int dias);
}