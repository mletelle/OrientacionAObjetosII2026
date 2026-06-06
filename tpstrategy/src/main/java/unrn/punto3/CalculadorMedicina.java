package unrn.punto3;

public class CalculadorMedicina implements CalculadorDePrecios {
    @Override
    public double precioFinal(double precio) {
        double impuestos = 0;
        double descuentos = 0;
        boolean envioGratis = false;
        if (precio > 50) {
            descuentos = 0.1;
        }
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
