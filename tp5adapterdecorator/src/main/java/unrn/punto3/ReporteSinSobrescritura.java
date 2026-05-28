package unrn.punto3;

import java.io.File;

public class ReporteSinSobrescritura extends ReporteDecorador {
    public ReporteSinSobrescritura(Reporte reporte) {
        super(reporte);
    }

    @Override
    public void exportar(File file) {
        if (file == null) {
            throw new IllegalArgumentException("File es NULL.");
        }

        if (file.exists()) {
            throw new IllegalArgumentException("El archivo ya existe.");
        }

        exportarReporte(file);
    }
}
