package ar.unrn.tp0.noanemico;

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

    public String getFormatoLargo() {
        String[] meses = {"", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        String[] dias = {"Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};

        LocalDate fecha = LocalDate.of(anio, mes, dia);
        int numeroDia = fecha.getDayOfWeek().getValue();
        int diaSemana = numeroDia == 7 ? 0 : numeroDia;

        return dias[diaSemana] + " " + dia + " de " + meses[mes] + " de " + anio;
    }

    public String getFormatoCorto() {
        return String.format("%02d/%02d/%04d", dia, mes, anio);
    }
}
