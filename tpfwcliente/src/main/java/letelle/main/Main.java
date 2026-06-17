package letelle.main;

import letelle.framework.FrameworkAcciones;

public class Main {

    private static final String RUTA_CONFIGURACION = "src/main/resources/acciones.properties";

    public static void main(String[] args) {
        FrameworkAcciones framework = new FrameworkAcciones(RUTA_CONFIGURACION);
        framework.iniciar();
    }
}