package unrn.punto5;

public class ConcursoConNotificacionSlack extends ConcursoDecorador {
    private final Notificador notificador;

    public ConcursoConNotificacionSlack(Inscribible concurso, Notificador notificador) {
        super(concurso);
        this.notificador = notificador;
    }

    @Override
    public void inscribirA(Participante participante) {
        inscribirEnConcurso(participante);
        notificador.notificar(participante);
    }
}