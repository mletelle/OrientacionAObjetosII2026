package unrn.punto2;

public class Bebida extends Producto {

    public Bebida(double precio) {
        super(precio);
    }

    @Override
    public double sumarPrecioBebida(double total) {
        return total + this.precio;
    }
}
