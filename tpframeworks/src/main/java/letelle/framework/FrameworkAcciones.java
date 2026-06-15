package letelle.framework;

import java.util.List;
import java.util.Scanner;

public class FrameworkAcciones {
    private final List<Accion> acciones;

    public FrameworkAcciones(String rutaConfiguracion) {
        this.acciones = CargadorAcciones.cargar(rutaConfiguracion);
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            mostrarMenu();
            String entrada = scanner.nextLine();
            continuar = procesarOpcion(entrada);
        }
    }

    private void mostrarMenu() {
        System.out.println("Bienvenido, opciones:");
        for (int indice = 0; indice < acciones.size(); indice++) {
            Accion accion = acciones.get(indice);
            System.out.printf("%d. %s (%s)%n", indice + 1, accion.nombreItemMenu(), accion.descripcionItemMenu());
        }
        System.out.println((acciones.size() + 1) + ". Salir");
        System.out.print("Ingrese su opción: ");
    }

    private boolean procesarOpcion(String entrada) {
        int opcion;
        try {
            opcion = Integer.parseInt(entrada);
        } catch (NumberFormatException exception) {
            System.out.println("La opción ingresada debe ser un número.");
            return true;
        }
        int opcionSalir = acciones.size() + 1;
        if (opcion == opcionSalir) {
            System.out.println("Programa finalizado.");
            return false;
        }
        if (opcion < 1 || opcion > acciones.size()) {
            System.out.println("La opción ingresada no es válida.");
            return true;
        }
        ejecutarAccion(acciones.get(opcion - 1));
        return true;
    }

    private void ejecutarAccion(Accion accion) {
        try {
            accion.ejecutar();
            System.out.println("La acción finalizó correctamente.");
        } catch (RuntimeException exception) {
            System.out.println("La acción no pudo ejecutarse: " + exception.getMessage());
        }
    }
}