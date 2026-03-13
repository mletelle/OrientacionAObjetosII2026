package ar.unrn.completosyvalidos;

import java.time.YearMonth;

public class TarjetaCredito1 {
    private String numero;
    private String titular;
    private YearMonth fechaVencimiento;
    private String codigoSeguridad;

    public TarjetaCredito1() {
    }

    public boolean estaVencida() {
        var hoy = YearMonth.now();
        return fechaVencimiento.isBefore(hoy);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public YearMonth getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(YearMonth fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }
}
