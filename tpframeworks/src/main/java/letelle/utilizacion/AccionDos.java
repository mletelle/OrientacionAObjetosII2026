package letelle.utilizacion;

import letelle.framework.Accion;

public class AccionDos implements Accion {

    @Override
    public void ejecutar() {
        System.out.println("Ejecutando AccionDos...");
    }

    @Override
    public String nombreItemMenu() {
        return "Accion 2";
    }

    @Override
    public String descripcionItemMenu() {
        return "Esta es la segunda accion";
    }
}