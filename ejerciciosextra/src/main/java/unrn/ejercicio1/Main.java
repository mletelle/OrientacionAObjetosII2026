package unrn.ejercicio1;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        FileManager fileManager = new FileManager();

        Archivo archivo = new Archivo(
                "reporte",
                "pdf",
                2048,
                LocalDate.of(2026, 6, 1),
                LocalDate.of(2026, 6, 8),
                Permiso.ESCRITURA
        );

        fileManager.crearArchivo(archivo);

        ArchivoMostrable nombreExtension =
                new ConExtension(
                        new ConNombre(archivo)
                );

        System.out.println(nombreExtension.prettyPrint());

        ArchivoMostrable permisosNombreExtensionTamaño =
                new ConTamanio(
                        new ConExtension(
                                new ConNombre(
                                        new ConPermiso(archivo)
                                )
                        )
                );

        System.out.println(permisosNombreExtensionTamaño.prettyPrint());

        ArchivoMostrable fechaPermisoNombre =
                new ConNombre(
                        new ConPermiso(
                                new ConFechaCreacion(archivo)
                        )
                );

        System.out.println(fechaPermisoNombre.prettyPrint());
    }
}