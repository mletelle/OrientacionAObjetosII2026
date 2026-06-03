package unrn.punto2;


import java.util.ArrayList;
import java.util.List;

public class EmpleadoJerarquico implements Empleado {
    public static final String VALIDA_DIRECTOR = "Como director solo mandos medios pueden estar a mi cargo";
    public static final String VALIDA_MANDOMEDIO = "Como mando medio solo juniors pueden estar a mi cargo";
    public static final String VALIDA_EMPLADO_JERARQUICO = "Solo directores o mandos medios son empleados jerarquicos";
    public static final String ASIGNACION_EMPLEADO_INVALIDA = "Asignacion de empleado invalida";
    private final String nombre;
    private List<Empleado> empleados;
    private float salario;
    private Cargo cargo;

    public EmpleadoJerarquico(String nombre, float salario, Cargo cargo) {
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = cargo;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        if (!this.cargo.puedeTenerA(empleado.cargo())) {
            throw new RuntimeException(ASIGNACION_EMPLEADO_INVALIDA);
        }
        this.empleados.add(empleado);
    }

    @Override
    public float calcularSalario() {
        float total = this.salario;
        for (Empleado m : empleados) {
            total += m.calcularSalario();
        }
        return total;
    }

    @Override
    public Cargo cargo() {
        return this.cargo;
    }

    public boolean tieneDeEmpeadoA(Empleado empleado) {
        return this.empleados.contains(empleado);
    }
}
