package unrn.punto1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Concurso {
    private final int id;
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private List<Participante> participantes;
    private Registrador registrador;
    private Notificador notificador;

    public Concurso(int id, String nombre, LocalDate fechaInicio, LocalDate fechaFin, Registrador registrador, Notificador notificador) {
        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.participantes = new ArrayList<Participante>();
        this.registrador = registrador;
        this.notificador = notificador;
    }

    public int getId() {//para registrador
        return id;
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
        if (esDiaDeInicio(hoy)) {
            participante.agregarPuntos(10);
        }
        registrador.registrar(participante, this);
        notificador.notificar(participante);

    }

    private boolean esDiaDeInicio(LocalDate hoy) {
        return hoy.equals(fechaInicio);
    }


    public boolean estaInscripto(Participante participante) {
        return participantes.contains(participante);
    }
}
