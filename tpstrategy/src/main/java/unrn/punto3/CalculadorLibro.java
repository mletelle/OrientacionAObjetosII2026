package unrn.punto3;

public class CalculadorLibro implements CalculadorDePrecios {
    @Override
    public double precioFinal(double precio) {
        double impuestos = 0.1;
        double descuentos = 0.1;
        boolean envioGratis = false;
        if (precio > 100) {
            envioGratis = true;
        }
        double total = precio * (1 + impuestos) * (1 - descuentos);
        if (envioGratis) {
            total -= 10;
        }
        return total;
    }
}
