package main;

import modelo.SaludadorCumple;
import persistencia.ArchivoTexto;
import servicio.NotificacionPorEmail;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        var notificacion = new NotificacionPorEmail("sandbox.smtp.mailtrap.io", 2525, "2372cd9060f4e7",
                "4dea3ceb1dc317", "concurso@tp2.com");
        var empleados = new ArchivoTexto("src/main/resources/empleados.txt");
        var saludador = new SaludadorCumple(empleados, notificacion);
        saludador.saludarEmpleados(LocalDate.now());
    }
}
