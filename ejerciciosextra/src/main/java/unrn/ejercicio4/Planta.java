package unrn.ejercicio4;

import java.time.Year;

public class Planta extends Empleado {

    public Planta(boolean esCasado, int cantidadHijos, Year anioIngreso, Convenio convenio) {
        super(esCasado, cantidadHijos, anioIngreso, convenio);
    }

    @Override
    double sueldoSegun(Convenio convenio) {
        return convenio.sueldoPara(this);
    }
}
