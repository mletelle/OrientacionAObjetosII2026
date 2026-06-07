package unrn.punto2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path ruta = Files.createTempDirectory("archivos");
        Files.writeString(ruta.resolve("importante.txt"), "Contenido importante");
        Files.writeString(ruta.resolve("manual.txt"), "Contenido intermedio");
        Files.writeString(ruta.resolve("publico.txt"), "Contenido");
        Usuario administrador = new Usuario("Ana", List.of(Permiso.ADMIN));
        Usuario usuarioBasico = new Usuario("Juan", List.of(Permiso.BASICO));
        Archivo importanteReal = new FileAccess(ruta.toString(), "importante.txt");
        Archivo importanteProtegido = new FileAccessProxy(administrador, importanteReal, "importante.txt");
        System.out.println(importanteProtegido.readFile());
        Archivo importanteParaBasico = new FileAccessProxy(usuarioBasico, importanteReal, "importante.txt");
        System.out.println(importanteParaBasico.readFile());
    }
}
