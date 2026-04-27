package ar.unrn.persistencia;

import ar.unrn.modelo.Participante;
import ar.unrn.modelo.RepositorioInscripciones;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class RepositorioInscripcionesArchivo implements RepositorioInscripciones {
    private String pathArchivo;

    public RepositorioInscripcionesArchivo(String pathArchivo) {
        this.pathArchivo = pathArchivo;
    }

    @Override
    public void guardarInscripcion(Participante p) {
        try {
            String linea = p.lastName() + ", " + p.name() + ", " + p.telefono() + ", " + p.email() + ", " + p.concurso().id();

            Files.writeString(
                    Paths.get(pathArchivo), linea + "\n", StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND
            );

        } catch (IOException e) {
            System.out.println("Error guardando inscripción: " + e.getMessage());
        }
    }
}