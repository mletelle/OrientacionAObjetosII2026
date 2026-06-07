package unrn.punto2.programa;

import unrn.punto2.modelo.RepositorioConcursos;
import unrn.punto2.modelo.RepositorioInscripciones;
import unrn.punto2.modelo.SistemaInscripcion;
import unrn.punto2.persistencia.RepositorioConcursosArchivo;
import unrn.punto2.persistencia.RepositorioInscripcionesArchivo;
import unrn.punto2.vista.RadioCompetition;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        RepositorioConcursos repoConcurso = new RepositorioConcursosArchivo("src/main/resources/concursos.txt");
        RepositorioInscripciones repoInscripciones = new RepositorioInscripcionesArchivo("src/main/resources/inscriptos.txt");
        SistemaInscripcion sistema = new SistemaInscripcion(repoConcurso, repoInscripciones);
        SwingUtilities.invokeLater(() -> new RadioCompetition(sistema));
    }
}
