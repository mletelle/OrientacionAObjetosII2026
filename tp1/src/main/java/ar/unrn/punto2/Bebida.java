package ar.unrn.punto2;

public class Bebida implements Producto {
    private double precio;

    public Bebida(double precio) {
        this.precio = precio;
    }

    public double calcularPrecio(Tarjeta tarjeta) {
        return tarjeta.descontarBebida(precio);
    }
}
