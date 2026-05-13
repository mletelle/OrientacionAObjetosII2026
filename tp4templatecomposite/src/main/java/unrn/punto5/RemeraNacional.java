package unrn.punto5;

public class RemeraNacional extends Remera {

    public static final double RECARGO = 0.015;
    public static final double BONIFICACION = 0.2;
    public static final double RECARGOPVP = 0.15;

    protected RemeraNacional(double precioUnitario) {
        super(precioUnitario);
    }

    @Override
    double calcularRecargo(double precioFinal) {
        return precioFinal + (precioFinal * RECARGO);
    }

    @Override
    double calcularImpuestos(double precioFinal) {
        return precioFinal - (precioFinal * BONIFICACION);
    }

    @Override
    double calcularPVP(double precioFinal) {
        return precioFinal + (precioFinal * RECARGOPVP);
    }
}
