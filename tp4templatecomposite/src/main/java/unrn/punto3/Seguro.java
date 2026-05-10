package unrn.punto3;

public class Seguro implements ItemSeguro {
    private TipoSeguro tipo;
    private int montoBase;

    public Seguro(TipoSeguro tipo, int montoBase) {
        this.tipo = tipo;
        this.montoBase = montoBase;
    }

    @Override
    public double calcularMonto() {
        return montoBase;
    }
}
