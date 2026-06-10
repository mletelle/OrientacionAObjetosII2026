package unrn.ejercicio1;

public class ConFechaModificacion extends ArchivoDecorador {
    public ConFechaModificacion(ArchivoMostrable archivo) {
        super(archivo);
    }

    @Override
    public String prettyPrint() {
        return archivo.prettyPrint() + " " + fechaModificacion().toString();
    }
}