package unrn.punto1;

import java.util.Random;
import java.util.Scanner;

public class Juego {
    // Opciones posibles
    private String[] opciones = {"piedra", "papel", "tijera"};
    // Crear un objeto Scanner para leer la entrada del usuario
    private Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        boolean continuar = true;
        while (continuar) {
            Elemento eleccionUsuario = elegirElementoUsuario(scanner);
            Elemento eleccionComputadora = elegirElementoComputadora(opciones);

            // Mostrar las elecciones de ambos jugadores
            System.out.println("Tu elección: " + eleccionUsuario);
            System.out.println("Elección de la computadora: " + eleccionComputadora);

            // Mostrar el resultado
            System.out.println(new Jugada().jugar(eleccionUsuario, eleccionComputadora));

            continuar = preguntarSiQueremosContinuar();
        }// end while

        System.out.println("¡Hasta pronto!");
        scanner.close();
    }

    private Elemento elegirElementoUsuario(Scanner scanner) {
        System.out.println("Elige una opción: piedra, papel o tijera");
        String eleccion = scanner.nextLine().toLowerCase();
        return crearElemento(eleccion);
    }

    private Elemento elegirElementoComputadora(String[] opciones) {
        Random random = new Random();
        int indice = random.nextInt(3);
        return crearElemento(opciones[indice]);
    }

    private Elemento crearElemento(String eleccion) {
        if (eleccion.equals("piedra")) {
            return new Piedra();
        }
        if (eleccion.equals("papel")) {
            return new Papel();
        }
        if (eleccion.equals("tijera")) {
            return new Tijera();
        }

        throw new IllegalArgumentException("Elemento inválido: " + eleccion);
    }

    private boolean preguntarSiQueremosContinuar() {
        System.out.println("¿Desea continuar? s/n");
        Scanner scanner = new Scanner(System.in);
        String respuesta = scanner.nextLine();
        return respuesta.toLowerCase().charAt(0) == 's';
    }
}