package unrn.punto2.modelo;

public class SistemaInscripcion {
    private RepositorioInscripciones participantes;
    private RepositorioConcursos concursos;

    public SistemaInscripcion(RepositorioConcursos repoConcurso, RepositorioInscripciones repoInscripciones) {
        this.participantes = repoInscripciones;
        this.concursos = repoConcurso;
    }

    public void inscribir(String nombre, String apellido, String dni,
                          String email, String telefono, Concurso concurso) {
        Participante p = new Participante(nombre, apellido, dni, email, telefono, concurso);
        participantes.guardarInscripcion(p);
    }

    public RepositorioConcursos concursos() {
        return concursos;
    }
}