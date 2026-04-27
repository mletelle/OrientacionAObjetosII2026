package modelo;

import java.util.List;

public class FakeListaEmpleados implements ListaEmpleados {
    @Override
    public void agregarEmpleado(Empleado empleado) {

    }

    @Override
    public List<Empleado> totalEmpleados() {
        return List.of();
    }
}
