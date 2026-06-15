package letelle.framework;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CargadorAccionesTest {

    @Test
    public void cargarAccionesConfiguradas() throws IOException {
        Path archivo = Files.createTempFile("acciones", ".properties");
        Files.writeString(archivo, "acciones=letelle.utilizacion.AccionUno;letelle.utilizacion.AccionDos");
        List<Accion> acciones = CargadorAcciones.cargar(archivo.toString());
        assertEquals(2, acciones.size());
        assertEquals("Accion 1", acciones.get(0).nombreItemMenu());
        assertEquals("Accion 2", acciones.get(1).nombreItemMenu());
    }

    @Test
    public void configuracionSinAcciones() throws IOException {
        Path archivo = Files.createTempFile("acciones", ".properties");
        Files.writeString(archivo, "otraPropiedad=valor");
        assertThrows(ConfiguracionException.class, () -> CargadorAcciones.cargar(archivo.toString()));
    }

    @Test
    public void claseConfiguradaNoExiste() throws IOException {
        Path archivo = Files.createTempFile("acciones", ".properties");
        Files.writeString(archivo, "acciones=una.clase.QueNoExiste");
        assertThrows(ConfiguracionException.class, () -> CargadorAcciones.cargar(archivo.toString())
        );
    }

}
