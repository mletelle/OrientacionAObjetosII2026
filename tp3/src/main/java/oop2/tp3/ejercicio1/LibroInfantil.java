package oop2.tp3.ejercicio1;

public class LibroInfantil extends Libro {

    public LibroInfantil(String nombre) {
        super(nombre);
    }

    @Override
    double calcularMonto(int dias) {
        return 1.5 + ((dias > 3) ? ((dias - 3) * 1.5) : 0);
    }

    @Override
    int calcularPuntos(int dias) {
        return 1;
    }
}
