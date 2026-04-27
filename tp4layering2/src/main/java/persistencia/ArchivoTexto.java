package persistencia;

import modelo.Empleado;
import modelo.ListaEmpleados;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

public class ArchivoTexto implements ListaEmpleados {
    private static final DateTimeFormatter ANIOMESDIA = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    private String archivo;

    public ArchivoTexto(String archivo) {
        this.archivo = archivo;
    }

    @Override
    public void agregarEmpleado(Empleado empleado) {

    }

    @Override
    public List<Empleado> totalEmpleados() {
        try {
            return Files.lines(Paths.get(archivo)).map(linea -> parsearEmpleado(linea)).collect(Collectors.toList());
        } catch (IOException e) {
            return List.of();
        }
    }

    private Empleado parsearEmpleado(String linea) {
        String[] partes = linea.split(",");
        String apellido = partes[0].trim();
        String nombre = partes[1].trim();
        LocalDate fecha = LocalDate.parse(partes[2].trim(), ANIOMESDIA);
        String email = partes[3].trim();
        return new Empleado(nombre, apellido, fecha, email);
    }
}
