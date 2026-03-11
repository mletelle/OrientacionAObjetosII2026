package ar.unrn.tp0.anemico;

import java.time.LocalDate;

public class Tiempo {
    private int dia;
    private int mes;
    private int anio;

    public Tiempo() {
        LocalDate hoy = LocalDate.now();
        this.dia = hoy.getDayOfMonth();
        this.mes = hoy.getMonthValue();
        this.anio = hoy.getYear();
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
