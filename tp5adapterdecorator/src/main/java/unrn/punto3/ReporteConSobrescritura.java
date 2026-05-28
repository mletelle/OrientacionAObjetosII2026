package unrn.punto3;

import java.io.File;

public class ReporteConSobrescritura extends ReporteDecorador {
    public ReporteConSobrescritura(Reporte reporte) {
        super(reporte);
    }

    @Override
    public void exportar(File file) {
        exportarReporte(file);
    }
}
