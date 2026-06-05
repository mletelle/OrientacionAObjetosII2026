package unrn.punto2;

import java.time.LocalDate;

public class Persona {
    private LocalDate fecha;
    private FormatoFechaNacimiento formato;

    public Persona(LocalDate fechaDeNacimiento, FormatoFechaNacimiento formato) {
        this.fecha = fechaDeNacimiento;
        this.formato = formato;
    }

    public String fechaNacimiento() {
        return this.formato.formatear(this.fecha);
    }
}
