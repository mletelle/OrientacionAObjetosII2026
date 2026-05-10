package unrn.punto1;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoJerarquico implements Empleado {
    private double sueldo;
    private List<Empleado> subordinados;

    public EmpleadoJerarquico(double sueldo) {
        this.sueldo = sueldo;
        this.subordinados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) {
        subordinados.add(e);
    }

    @Override
    public double calcularSalario() {
        double total = sueldo;
        for (Empleado subordinado : subordinados) {
            total += subordinado.calcularSalario();
        }
        return total;
    }
}
