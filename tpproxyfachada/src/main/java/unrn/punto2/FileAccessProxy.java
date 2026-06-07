package unrn.punto2;

import java.io.IOException;

public class FileAccessProxy implements Archivo {
    private Usuario usuario;
    private Archivo archivoReal;
    private String nombreArchivo;

    public FileAccessProxy(Usuario usuario, Archivo archivoReal, String nombreArchivo) {
        this.usuario = usuario;
        this.archivoReal = archivoReal;
        this.nombreArchivo = nombreArchivo;
    }

    public String readFile() throws IOException {
        if (nombreArchivo.startsWith("i") && !usuario.poseePermiso(Permiso.ADMIN)) {
            throw new RuntimeException("El usuario no posee permiso");
        }
        if (nombreArchivo.startsWith("m") && !usuario.poseePermiso(Permiso.ADMIN) && !usuario.poseePermiso(Permiso.INTERMEDIO)) {
            throw new RuntimeException("El usuario no posee permiso");
        }
        return archivoReal.readFile();
    }
}