package unrn.punto2;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RegistradorArchivo implements Registrador {
    private final String ruta;

    public RegistradorArchivo(String ruta) {
        this.ruta = ruta;
    }

    public void registrar(double total) {
        String fecha = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String linea = fecha + "||" + total + "\n";
        try (FileWriter fw = new FileWriter(ruta, true)) {
            fw.write(linea);
        } catch (IOException e) {
            throw new RuntimeException("Error al escribir en el archivo");
        }
    }
}