package unrn.punto1;

public class Producto {
    private double precio;
    private double peso;

    public Producto(double precio, double peso) {
        this.precio = precio;
        this.peso = peso;
    }

    public double precio() {
        return this.precio;
    }

    public double peso() {
        return this.peso;
    }

}
