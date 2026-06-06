package unrn.punto3;

public class CalculadorAlimento implements CalculadorDePrecios {
    @Override
    public double precioFinal(double precio) {
        double impuestos = 0.05;
        double descuentos = 0;
        boolean envioGratis = false;
        if (precio > 100) {
            descuentos = 0.15;
        }
        if (precio > 200) {
            envioGratis = true;
        }
        double total = precio * (1 + impuestos) * (1 - descuentos);
        if (envioGratis) {
            total -= 10;
        }
        return total;
    }
}
