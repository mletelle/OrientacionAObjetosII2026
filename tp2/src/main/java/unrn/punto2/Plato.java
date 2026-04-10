package unrn.punto2;

public class Plato extends Producto {

    public Plato(double precio) {
        super(precio);
    }

    @Override
    public double sumarPrecioPlato(double total) {
        return total + this.precio;
    }
}
