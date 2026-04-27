package ar.unrn.programa;

import ar.unrn.modelo.RepositorioConcursos;
import ar.unrn.modelo.RepositorioInscripciones;
import ar.unrn.modelo.SistemaInscripcion;
import ar.unrn.persistencia.RepositorioConcursosArchivo;
import ar.unrn.persistencia.RepositorioInscripcionesArchivo;
import ar.unrn.vista.RadioCompetition;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        RepositorioConcursos repoConcurso = new RepositorioConcursosArchivo("src/main/resources/concursos.txt");
        RepositorioInscripciones repoInscripciones = new RepositorioInscripcionesArchivo("src/main/resources/inscriptos.txt");
        SistemaInscripcion sistema = new SistemaInscripcion(repoConcurso, repoInscripciones);
        SwingUtilities.invokeLater(() -> new RadioCompetition(sistema));
    }
}