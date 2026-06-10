package unrn.ejercicio4;

import java.time.Year;

public class Pasante extends Empleado {
    private int cantidadExamenesRendidos;

    public Pasante(boolean esCasado, int cantidadHijos, Year anioIngreso, int cantidadExamenesRendidos, Convenio convenio) {
        super(esCasado, cantidadHijos, anioIngreso, convenio);
        this.cantidadExamenesRendidos = cantidadExamenesRendidos;
    }

    @Override
    double sueldoSegun(Convenio convenio) {
        return convenio.sueldoPara(this);
    }

    int cantidadExamenesRendidos() {
        return this.cantidadExamenesRendidos;
    }
}
