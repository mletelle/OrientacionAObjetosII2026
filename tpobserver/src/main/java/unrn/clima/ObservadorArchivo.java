package unrn.clima;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

public class ObservadorArchivo implements Observador {
    @Override
    public void actualizar(String temperatura) {
        String linea = LocalDateTime.now() + " - " + temperatura + System.lineSeparator();
        try {
            Files.writeString(Path.of("temperaturas.txt"), linea, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
