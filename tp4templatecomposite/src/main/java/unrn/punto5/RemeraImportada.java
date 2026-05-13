package unrn.punto5;

public class RemeraImportada extends Remera {
    public static final double RECARGO = 0.03;
    public static final double IMPUESTO = 0.05;
    public static final double RECARGOPVP = 0.25;

    protected RemeraImportada(double precioUnitario) {
        super(precioUnitario);
    }

    @Override
    double calcularRecargo(double precioFinal) {
        return precioFinal + (precioFinal * RECARGO);
    }

    @Override
    double calcularImpuestos(double precioFinal) {
        return precioFinal + (precioFinal * IMPUESTO);
    }


    @Override
    double calcularPVP(double precioFinal) {
        return precioFinal + (precioFinal * RECARGOPVP);
    }
}
