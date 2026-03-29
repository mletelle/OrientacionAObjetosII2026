package unrn.punto2;

public class Plato implements Producto {
    private final double precio;

    public Plato(double precio) {
        this.precio = precio;
    }

    public double precioBebida() {
        return 0;
    }

    public double precioPlato() {
        return this.precio;
    }
}
