package unrn.ejercicio2;

import java.util.List;

public class VoorheesExporter implements ExportadorSocios {

    private String exportar(Socio socio) {
        String separator = System.lineSeparator();
        return "\t{" + separator
                + "\t\t\"nombre\": \"" + socio.nombre() + "\"," + separator
                + "\t\t\"email\": \"" + socio.email() + "\"," + separator
                + "\t\t\"legajo\": \"" + socio.legajo() + "\"" + separator
                + "\t}";
    }

    @Override
    public String exportar(List<Socio> socios) {
        if (socios.isEmpty()) {
            return "[]";
        }
        String separator = System.lineSeparator();
        StringBuilder buffer = new StringBuilder("[" + separator);
        socios.forEach(socio -> {
            buffer.append(this.exportar(socio))
                    .append(",")
                    .append(separator);
        });
        // remueve la última coma y fin de línea
        buffer.setLength(buffer.length() - (separator.length() + 1));
        buffer.append(separator).append("]");
        return buffer.toString();
    }
}
