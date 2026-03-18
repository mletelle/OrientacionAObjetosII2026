package ar.unrn.punto1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Concurso {
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    private List<Participante> participantes;

    public Concurso(String nombre, LocalDate fechaInicio, LocalDate fechaFin) {
        this.nombre = nombre;
        this.participantes = new ArrayList<Participante>();
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public void inscribirA(Participante participante) {
        LocalDate hoy = LocalDate.now();
        if (hoy.isAfter(fechaFin)) {
            throw new IllegalArgumentException("Inscripcion finalizada");
        }
        if (hoy.isBefore(fechaInicio)) {
            throw new IllegalArgumentException("Inscripcion aun no disponible");
        }
        participantes.add(participante);
        if (hoy.equals(fechaInicio)) {
            participante.bonificarInscripcion();
        }
    }

    public boolean estaInscripto(Participante participante) {
        return participantes.contains(participante);
    }
}
