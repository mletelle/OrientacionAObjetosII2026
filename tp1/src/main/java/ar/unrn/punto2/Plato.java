package ar.unrn.punto2;

public class Plato implements Producto {
    private double precio;

    public Plato(double precio) {
        this.precio = precio;
    }

    public double calcularPrecio(Tarjeta tarjeta) {
        return tarjeta.descontarPlato(precio);
    }
}
