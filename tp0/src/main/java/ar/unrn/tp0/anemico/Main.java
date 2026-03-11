package ar.unrn.tp0.anemico;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Tiempo tiempo = new Tiempo();

        String[] meses = {"", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        String[] dias = {"Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
 
        LocalDate fecha = LocalDate.of(tiempo.getAnio(), tiempo.getMes(), tiempo.getDia());
        int numeroDia = fecha.getDayOfWeek().getValue();
        int diaSemana = numeroDia == 7 ? 0 : numeroDia;


        String formatoLargo = dias[diaSemana] + " " + tiempo.getDia() + " de " +
                meses[tiempo.getMes()] + " de " + tiempo.getAnio();

        String formatoCorto = String.format("%02d/%02d/%04d", tiempo.getDia(),
                tiempo.getMes(), tiempo.getAnio());

        System.out.println("Formato largo: " + formatoLargo);
        System.out.println("Formato corto: " + formatoCorto);
    }
}
