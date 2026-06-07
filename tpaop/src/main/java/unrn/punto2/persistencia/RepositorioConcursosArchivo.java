package unrn.punto2.persistencia;

import unrn.punto2.modelo.Concurso;
import unrn.punto2.modelo.RepositorioConcursos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class RepositorioConcursosArchivo implements RepositorioConcursos {
    private String pathArchivo;

    public RepositorioConcursosArchivo(String pathArchivo) {
        this.pathArchivo = pathArchivo;
    }

    @Override
    public List<Concurso> obtenerConcursosAbiertos() {
        List<Concurso> concursosAbiertos = new ArrayList<>();
        try {
            List<String> lineas = Files.readAllLines(Paths.get(pathArchivo));
            for (String linea : lineas) {
                String[] partes = linea.split(",");
                int id = Integer.parseInt(partes[0].trim());
                String nombre = partes[1].trim();
                LocalDate fechaInicio = LocalDate.parse(partes[2].trim(), DateTimeFormatter.ofPattern("yyyy/MM/dd"));
                LocalDate fechaFin = LocalDate.parse(partes[3].trim(), DateTimeFormatter.ofPattern("yyyy/MM/dd"));
                Concurso concurso = new Concurso(id, nombre, fechaInicio, fechaFin);
                if (concurso.estaAbiertoPara(LocalDate.now())) {
                    concursosAbiertos.add(concurso);
                }
            }
        } catch (IOException e) {
            System.out.println("Error leyendo archivo");
        }

        return concursosAbiertos;
    }
}
