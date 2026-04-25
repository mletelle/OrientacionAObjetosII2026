package oop2.tp3.ejercicio6;


public class DescuentoVip implements Descuento {
    
    private static final double PORCENTAJE_DESCUENTO = 0.15;

    @Override
    public double calcularMonto(double subtotal) {
        return subtotal * PORCENTAJE_DESCUENTO;
    }
}
