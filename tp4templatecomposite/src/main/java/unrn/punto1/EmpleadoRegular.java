package unrn.punto1;

public class EmpleadoRegular implements Empleado {
    private double sueldo;

    public EmpleadoRegular(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public double calcularSalario() {
        return sueldo;
    }
}
