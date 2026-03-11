package ar.unrn.tp0.anemico;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Tiempo {
    private LocalDateTime tiempo;

    public Tiempo() {
        this.tiempo = LocalDateTime.now();
    }

    public void formatLargo() {
        this.tiempo.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
    }

    public void formatCorto() {
        this.tiempo.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
