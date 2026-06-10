package unrn.ejercicio4;

import java.time.Year;

public abstract class Empleado {
    private boolean esCasado;
    private int cantidadHijos;
    private Year anioIngreso;
    private Convenio convenio;

    protected Empleado(boolean esCasado, int cantidadHijos, Year anioIngreso, Convenio convenio) {
        this.esCasado = esCasado;
        this.cantidadHijos = cantidadHijos;
        this.anioIngreso = anioIngreso;
        this.convenio = convenio;
    }

    public double sueldo() {
        return sueldoSegun(convenio);
    }

    abstract double sueldoSegun(Convenio convenio);

    boolean esCasado() {
        return this.esCasado;
    }

    int cantidadDeHijos() {
        return this.cantidadHijos;
    }

    int aniosAntiquedad() {
        return Year.now().getValue() - anioIngreso.getValue();
    }
}
