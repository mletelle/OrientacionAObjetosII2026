package ar.unrn.completosyvalidos;

import java.time.YearMonth;

public class TarjetaCredito2 {

    private String numero;
    private String titular;
    private YearMonth fechaVencimiento;
    private String codigoSeguridad;

    public TarjetaCredito2(String numero, String titular, YearMonth fechaVencimiento, String codigoSeguridad) {
        this.numero = numero;
        this.titular = titular;
        this.fechaVencimiento = fechaVencimiento;
        this.codigoSeguridad = codigoSeguridad;
    }

    public boolean estaVencida() {
        var hoy = YearMonth.now();
        return fechaVencimiento.isBefore(hoy);
    }

}
