package modelo;

import java.util.List;

public interface ListaEmpleados {
    void agregarEmpleado(Empleado empleado);

    List<Empleado> totalEmpleados();
}
