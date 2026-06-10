package unrn.ejercicio4;

import java.time.Year;

public class Temporario extends Empleado {
    private final int horasTrabajadas;

    public Temporario(boolean esCasado, int cantidadHijos, Year anioIngreso, int horasTrabajadas, Convenio convenio) {
        super(esCasado, cantidadHijos, anioIngreso, convenio);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    double sueldoSegun(Convenio convenio) {
        return convenio.sueldoPara(this);
    }

    int horasTrabajadas() {
        return horasTrabajadas;
    }
}
