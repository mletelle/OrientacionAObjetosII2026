package unrn.punto2;

import java.time.LocalDate;

public class FormatoFechaCorto implements FormatoFechaNacimiento {

    @Override
    public String formatear(LocalDate fecha) {
        return fecha.getDayOfMonth() + "-" + fecha.getMonthValue() + "-" + fecha.getYear();
    }
}