package unrn.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Socio> socios;
    private ExportadorSocios exporter;

    public Biblioteca(ExportadorSocios exporter) {
        this.socios = new ArrayList<>();
        this.exporter = exporter;
    }

    public void agregarSocio(Socio socio) {
        socios.add(socio);
    }

    /**
     * Retorna la representación JSON de la colección de socios.
     */
    public String exportarSocios() {
        return exporter.exportar(socios);
    }
}
