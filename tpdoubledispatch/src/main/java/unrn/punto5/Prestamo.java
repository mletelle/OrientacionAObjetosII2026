package unrn.punto5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Prestamo {
    private Cliente cliente;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Articulo articulo;

    public Prestamo(Cliente cliente, LocalDate fechaInicio, Articulo articulo) {
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.articulo = articulo;
        this.fechaFin = fechaInicio.plusDays(articulo.diasDePrestamo());
    }

    public LocalDate fechaFin() {
        return fechaFin;
    }
}
