package letelle.utilizacion;

import letelle.framework.Accion;

public class AccionUno implements Accion {

    @Override
    public void ejecutar() {
        System.out.println("Ejecutando AccionUno desde el proyecto cliente...");
    }

    @Override
    public String nombreItemMenu() {
        return "Accion 1";
    }

    @Override
    public String descripcionItemMenu() {
        return "Primera accion del cliente";
    }
}