package oop2.tp3.ejercicio1;

public class LibroNuevoLanzamiento extends Libro {

    public LibroNuevoLanzamiento(String nombre) {
        super(nombre);
    }

    @Override
    double calcularMonto(int dias) {
        return dias * 3;
    }

    @Override
    int calcularPuntos(int dias) {
        return (dias > 1) ? 2 : 1;
    }
}
