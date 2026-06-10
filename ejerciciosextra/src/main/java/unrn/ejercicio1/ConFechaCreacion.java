package unrn.ejercicio1;

public class ConFechaCreacion extends ArchivoDecorador {
    public ConFechaCreacion(ArchivoMostrable archivo) {
        super(archivo);
    }

    @Override
    public String prettyPrint() {
        return archivo.prettyPrint() + " " + fechaCreacion().toString();
    }
}