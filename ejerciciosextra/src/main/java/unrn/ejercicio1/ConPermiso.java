package unrn.ejercicio1;

public class ConPermiso extends ArchivoDecorador {
    public ConPermiso(ArchivoMostrable archivo) {
        super(archivo);
    }

    @Override
    public String prettyPrint() {
        return archivo.prettyPrint() + " " + permiso();
    }
}