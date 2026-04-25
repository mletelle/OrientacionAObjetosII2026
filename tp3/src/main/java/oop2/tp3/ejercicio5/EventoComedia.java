package oop2.tp3.ejercicio5;

public class EventoComedia implements CalcularEvento {
    @Override
    public float calcularMonto(int espectadores) {
        float monto = 30000;
        if (espectadores > 20) {
            monto += 10000 + 500 * (espectadores - 20);
        }
        monto += 300 * espectadores;
        return monto;
    }

    @Override
    public int calcularCreditos(int espectadores) {
        return Math.max(espectadores - 30, 0) + (int) Math.floor(espectadores / 5.0);
    }
}