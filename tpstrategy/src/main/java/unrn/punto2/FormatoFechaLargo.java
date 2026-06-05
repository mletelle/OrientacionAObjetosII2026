package unrn.punto2;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class FormatoFechaLargo implements FormatoFechaNacimiento {

    @Override
    public String formatear(LocalDate fecha) {
        String mes = fecha.getMonth().getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
        mes = mes.substring(0, 1).toUpperCase() + mes.substring(1);
        return fecha.getDayOfMonth() + " de " + mes + " de " + fecha.getYear();
    }
}