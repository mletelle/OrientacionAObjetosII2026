package unrn.punto5;

public abstract class Remera {
    double precioUnitario;
    protected Remera(double precioUnitario) {  // ← constructor protegido
        this.precioUnitario = precioUnitario;
    }
    public final double calcularPrecioFinal() {
        double precioFinal = precioUnitario;
        precioFinal = calcularRecargo(precioFinal);
        precioFinal = calcularImpuestos(precioFinal);
        precioFinal = calcularPVP(precioFinal);
        return precioFinal;
    }

    abstract double calcularRecargo(double precioFinal);//

    abstract double calcularImpuestos(double precioFinal);//impuestos aduaneros

    abstract double calcularPVP(double precioFinal);//porcentaje final aplicado por comercio
}
