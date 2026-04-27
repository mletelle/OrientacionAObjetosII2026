package modelo;

import java.time.LocalDate;

public class SaludadorCumple {
    private ListaEmpleados empleados;
    private Notificador enviadorEmails;

    public SaludadorCumple(ListaEmpleados empleados, Notificador enviadorEmails) {
        this.empleados = empleados;
        this.enviadorEmails = enviadorEmails;
    }

    public void saludarEmpleados(LocalDate fecha) {
        var empleados = this.empleados.totalEmpleados();
        for (Empleado empleado : empleados) {
            if (empleado.esElCumpleDe(fecha)) {
                this.enviadorEmails.enviarSaludo(empleado.email(), "Feliz cumple");
            }
        }
    }
}
