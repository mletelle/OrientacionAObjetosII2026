package unrn.punto5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Concurso implements Inscribible {
    private final int id;
    private final String nombre;
    private final LocalDate fechaInicio;
    private final LocalDate fechaFin;
    private final List<Participante> participantes;
    private final Registrador registrador;

    public Concurso(int id, String nombre, LocalDate fechaInicio, LocalDate fechaFin, Registrador registrador) {
        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.participantes = new ArrayList<>();
        this.registrador = registrador;
    }

    public int getId() {
        return id;
    }

    @Override
    public void inscribirA(Participante participante) {
        LocalDate hoy = LocalDate.now();

        if (hoy.isAfter(fechaFin)) {
            throw new IllegalArgumentException("El concurso ya ha finalizado.");
        }

        if (hoy.isBefore(fechaInicio)) {
            throw new IllegalArgumentException("El concurso aun no ha comenzado.");
        }

        participantes.add(participante);

        if (esDiaDeInicio(hoy)) {
            participante.agregarPuntos(10);
        }

        registrador.registrar(participante, this);
        // notificador.notificar(participante); se fue al decorador
    }

    private boolean esDiaDeInicio(LocalDate hoy) {
        return hoy.equals(fechaInicio);
    }

    @Override
    public boolean estaInscripto(Participante participante) {
        return participantes.contains(participante);
    }
}