package unrn.punto4;

import java.time.LocalDate;
import java.time.Month;

public class CalculadorJubilado extends Calculador {
    public CalculadorJubilado(LogTransaction log, int mes, LocalDate fecha) {
        this.log = log;
        this.mesEnPromocion = mes;
        this.fechaActual = fecha;
    }

    public double calcularPrecioSubclase(double precioProducto) {
        double precioTotal = precioProducto;
        if (!Month.of(mesEnPromocion).equals(fechaActual.getMonth())) {
            precioTotal += precioProducto * 0.1;
        }
        return precioTotal;
    }
}