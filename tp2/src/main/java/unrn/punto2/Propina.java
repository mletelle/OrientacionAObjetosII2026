package unrn.punto2;

public enum Propina {
    DOS(0.02), TRES(0.030), CINCO(0.05);
    private final double porcentaje;

    Propina(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double calcularPropina(double precioBase) {
        return precioBase * this.porcentaje;
    }
}
