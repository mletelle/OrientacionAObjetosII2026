package unrn.punto3;

class Producto {
    private CalculadorDePrecios calculador;
    private double precio;


    public Producto(CalculadorDePrecios calcuPrecios, double precio) {
        this.calculador = calcuPrecios;
        this.precio = precio;
    }

    public double precioFinal() {
        return this.calculador.precioFinal(precio);
    }
}