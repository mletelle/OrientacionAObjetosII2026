package unrn.punto2;

public abstract class Producto {
    protected final double precio;

    public Producto(double precio) {
        this.precio = precio;
    }

    public double sumarPrecioBebida(double total) {
        return total;
    }

    public double sumarPrecioPlato(double total) {
        return total;
    }
}
