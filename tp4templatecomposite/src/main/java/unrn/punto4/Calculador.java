package unrn.punto4;

import java.time.LocalDate;

public abstract class Calculador {
    protected LogTransaction log;
    protected int mesEnPromocion;
    protected LocalDate fechaActual;

    public double calcularPrecio(double precioProducto) {
        double precioTotal = calcularPrecioSubclase(precioProducto);
        log.log(this.getClass().getName());
        return precioTotal;
    }

    abstract double calcularPrecioSubclase(double precioProducto);
}