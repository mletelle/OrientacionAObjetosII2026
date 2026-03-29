package unrn.punto2;

public class Bebida implements Producto {
    private final double precio;

    public Bebida(double precio) {
        this.precio = precio;
    }

    public double precioBebida() {
        return this.precio;
    }

    public double precioPlato() {
        return 0;
    }
}
