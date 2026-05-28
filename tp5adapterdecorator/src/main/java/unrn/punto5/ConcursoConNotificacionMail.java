package unrn.punto5;

public class ConcursoConNotificacionMail extends ConcursoDecorador {
    private final Notificador notificador;

    public ConcursoConNotificacionMail(Inscribible concurso, Notificador notificador) {
        super(concurso);
        this.notificador = notificador;
    }

    @Override
    public void inscribirA(Participante participante) {
        inscribirEnConcurso(participante);
        notificador.notificar(participante);
    }
}