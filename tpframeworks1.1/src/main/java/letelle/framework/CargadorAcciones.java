package letelle.framework;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public final class CargadorAcciones {
    private static final String CLAVE_ACCIONES = "acciones";

    private CargadorAcciones() {
    }

    public static List<Accion> cargar(String rutaConfiguracion) {
        Properties propiedades = leerPropiedades(rutaConfiguracion);
        String nombresDeClases = propiedades.getProperty(CLAVE_ACCIONES);
        if (nombresDeClases == null || nombresDeClases.isBlank()) {
            throw new ConfiguracionException("La configuración debe contener la propiedad 'acciones'");
        }
        List<Accion> acciones = new ArrayList<>();
        for (String nombreDeClase : nombresDeClases.split(";")) {
            String nombreNormalizado = nombreDeClase.trim();
            if (!nombreNormalizado.isEmpty()) {
                acciones.add(instanciar(nombreNormalizado));
            }
        }
        if (acciones.isEmpty()) {
            throw new ConfiguracionException("La configuración no contiene acciones válidas");
        }
        return List.copyOf(acciones);
    }

    private static Properties leerPropiedades(String rutaConfiguracion) {
        Properties propiedades = new Properties();
        Path ruta = Path.of(rutaConfiguracion);
        try (InputStream archivo = Files.newInputStream(ruta)) {
            propiedades.load(archivo);
            return propiedades;
        } catch (IOException exception) {
            throw new ConfiguracionException("No se pudo leer la configuración: " + rutaConfiguracion, exception);
        }
    }

    private static Accion instanciar(String nombreDeClase) {
        try {
            Class<? extends Accion> claseAccion = Class.forName(nombreDeClase).asSubclass(Accion.class);
            return claseAccion.getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException exception) {
            throw new ConfiguracionException("No se encontró la clase: " + nombreDeClase, exception);
        } catch (ClassCastException exception) {
            throw new ConfiguracionException("La clase no implementa Accion: " + nombreDeClase, exception);
        } catch (ReflectiveOperationException exception) {
            throw new ConfiguracionException("No se pudo instanciar la clase: " + nombreDeClase, exception);
        }
    }
}