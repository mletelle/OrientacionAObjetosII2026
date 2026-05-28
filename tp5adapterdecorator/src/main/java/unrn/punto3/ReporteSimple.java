package unrn.punto3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ReporteSimple implements Reporte {
    private String reporte;

    public ReporteSimple(String reporte) {
        this.reporte = reporte;
    }

    @Override
    public void exportar(File file) {
        if (file == null) {
            throw new IllegalArgumentException("File es NULL.");
        }
        try {
            Files.writeString(file.toPath(), reporte);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
