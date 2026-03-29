package unrn.punto1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Concurso {
    private String name;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private List<Participante> participantes;

    public Concurso(String nombre, LocalDate fechaInicio, LocalDate fechaFin) {
        this.name = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.participantes = new ArrayList<Participante>();
    }

    public void inscribirA(Participante participante) {
        LocalDate hoy = LocalDate.now();
        if (hoy.isAfter(fechaFin)) {
            throw new IllegalArgumentException("El concurso ya ha finalizado, no se pueden inscribir nuevos participantes.");
        }
        if (hoy.isBefore(fechaInicio)) {
            throw new IllegalArgumentException("El concurso aún no ha comenzado, no se pueden inscribir nuevos participantes.");
        }
        participantes.add(participante);
        if (hoy.equals(fechaInicio)) {
            participante.agregarPuntos(10);
        }
    }

    public boolean estaInscripto(Participante participante) {
        return participantes.contains(participante);
    }
}
