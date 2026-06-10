package unrn.ejercicio2;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(new GsonExporter());
        biblioteca.agregarSocio(new Socio("Juan Perez", "jperez@bla.com", "123"));
        biblioteca.agregarSocio(new Socio("Maria Gomez", "mgomez@bla.com", "432"));
        System.out.println(biblioteca.exportarSocios());
    }
}
