package letelle.framework;

import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.TextColor.ANSI;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;
import java.util.List;

public class FrameworkAcciones {
    private final List<Accion> acciones;
    private String mensaje;

    public FrameworkAcciones(String rutaConfiguracion) {
        this.acciones = CargadorAcciones.cargar(rutaConfiguracion);
        this.mensaje = "Seleccione una opcion.";
    }

    public void iniciar() {
        Screen screen = crearPantalla();

        try {
            boolean continuar = true;

            while (continuar) {
                mostrarMenu(screen);
                KeyStroke tecla = screen.readInput();
                continuar = procesarTecla(tecla);
            }
        } catch (IOException exception) {
            throw new RuntimeException("No se pudo leer la opcion ingresada.", exception);
        } finally {
            cerrarPantalla(screen);
        }
    }

    private Screen crearPantalla() {
        try {
            Terminal terminal = new DefaultTerminalFactory().createTerminal();
            Screen screen = new TerminalScreen(terminal);
            screen.startScreen();
            return screen;
        } catch (IOException exception) {
            throw new RuntimeException("No se pudo iniciar la pantalla.", exception);
        }
    }

    private void cerrarPantalla(Screen screen) {
        try {
            screen.stopScreen();
        } catch (IOException exception) {
            throw new RuntimeException("No se pudo cerrar la pantalla.", exception);
        }
    }

    private void mostrarMenu(Screen screen) throws IOException {
        screen.clear();
        TextGraphics texto = screen.newTextGraphics();
        texto.setForegroundColor(ANSI.CYAN);
        texto.enableModifiers(SGR.BOLD);
        texto.putString(2, 1, "Framework de acciones");
        texto.disableModifiers(SGR.BOLD);
        texto.setForegroundColor(ANSI.DEFAULT);
        texto.putString(2, 3, "Bienvenido, estas son sus opciones:");
        int fila = 5;
        for (int indice = 0; indice < acciones.size(); indice++) {
            Accion accion = acciones.get(indice);
            texto.putString(4, fila, (indice + 1) + ". " + accion.nombreItemMenu() + " (" + accion.descripcionItemMenu() + ")");
            fila++;
        }

        texto.putString(4, fila, (acciones.size() + 1) + ". Salir");

        texto.setForegroundColor(TextColor.ANSI.YELLOW);
        texto.putString(2, fila + 2, mensaje);

        texto.setForegroundColor(TextColor.ANSI.DEFAULT);
        texto.putString(2, fila + 4, "Presione el numero de la opcion.");

        screen.refresh();
    }

    private boolean procesarTecla(KeyStroke tecla) {
        if (tecla == null || tecla.getKeyType() == KeyType.EOF) {
            mensaje = "Programa finalizado.";
            return false;
        }

        if (tecla.getKeyType() != KeyType.Character) {
            mensaje = "La opcion ingresada debe ser un numero.";
            return true;
        }

        char caracter = tecla.getCharacter();

        if (!Character.isDigit(caracter)) {
            mensaje = "La opcion ingresada debe ser un numero.";
            return true;
        }

        int opcion = Character.getNumericValue(caracter);
        int opcionSalir = acciones.size() + 1;

        if (opcion == opcionSalir) {
            mensaje = "Programa finalizado.";
            return false;
        }

        if (opcion < 1 || opcion > acciones.size()) {
            mensaje = "La opcion ingresada no es valida.";
            return true;
        }

        mensaje = ejecutarAccion(acciones.get(opcion - 1));
        return true;
    }

    private String ejecutarAccion(Accion accion) {
        try {
            accion.ejecutar();
            return "La accion finalizo correctamente.";
        } catch (RuntimeException exception) {
            return "La accion no pudo ejecutarse: " + exception.getMessage();
        }
    }
}