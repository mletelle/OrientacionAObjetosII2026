package unrn.punto5;

public abstract class ConcursoDecorador implements Inscribible {
    private final Inscribible concurso;

    public ConcursoDecorador(Inscribible concurso) {
        this.concurso = concurso;
    }

    protected void inscribirEnConcurso(Participante participante) {
        concurso.inscribirA(participante);
    }

    @Override
    public boolean estaInscripto(Participante participante) {
        return concurso.estaInscripto(participante);
    }
}