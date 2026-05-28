package unrn.punto3;

import java.io.File;

public abstract class ReporteDecorador implements Reporte {
    private final Reporte reporte;

    public ReporteDecorador(Reporte reporte) {
        this.reporte = reporte;
    }

    protected void exportarReporte(File file) {
        reporte.exportar(file);
    }
}
