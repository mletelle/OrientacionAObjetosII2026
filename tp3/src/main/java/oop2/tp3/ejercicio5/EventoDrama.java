package oop2.tp3.ejercicio5;

public class EventoDrama implements CalcularEvento {
    @Override
    public float calcularMonto(int espectadores) {
        float monto = 40000;
        if (espectadores > 30) {
            monto += 1000 * (espectadores - 30);
        }
        return monto;
    }

    @Override
    public int calcularCreditos(int espectadores) {
        return Math.max(espectadores - 30, 0);
    }
}