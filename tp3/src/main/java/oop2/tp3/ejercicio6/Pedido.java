package oop2.tp3.ejercicio6;

public class Pedido {

    private double subtotal;
    private Descuento descuento;

    public Pedido(double subtotal, Descuento descuento) {
        this.validarSubtotal(subtotal);
        this.subtotal = subtotal;
        this.descuento = descuento;
    }

    private void validarSubtotal(double subtotal) {
        if (subtotal < 0) {
            throw new IllegalArgumentException("El subtotal no puede ser negativo");
        }
    }

    public double total() {
        double descuentoAplicado = this.descuento.calcularMonto(this.subtotal);
        return this.subtotal - descuentoAplicado;
    }

    public double subtotal() {
        return this.subtotal;
    }
}

