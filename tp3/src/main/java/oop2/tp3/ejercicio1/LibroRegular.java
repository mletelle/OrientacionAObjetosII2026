package oop2.tp3.ejercicio1;

public class LibroRegular extends Libro {
    public LibroRegular(String nombre) {
        super(nombre);
    }

    @Override
    double calcularMonto(int dias) {
        return 2 + ((dias > 2) ? ((dias - 2) * 1.5) : 0);
    }

    @Override
    int calcularPuntos(int dias) {
        return 1;
    }
}
