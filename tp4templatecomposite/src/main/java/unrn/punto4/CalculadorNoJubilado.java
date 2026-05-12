package unrn.punto4;

import java.time.LocalDate;
import java.time.Month;

public class CalculadorNoJubilado extends Calculador {
    public CalculadorNoJubilado(LogTransaction log, int mes, LocalDate fecha) {
        this.log = log;
        this.mesEnPromocion = mes;
        this.fechaActual = fecha;
    }

    public double calcularPrecioSubclase(double precioProducto) {
        double precioTotal = precioProducto;
        if (Month.of(mesEnPromocion).equals(fechaActual.getMonth())) {
            precioTotal += precioProducto * 0.15;
        } else {
            precioTotal += precioProducto * 0.21;
        }
        return precioTotal;
    }
}
