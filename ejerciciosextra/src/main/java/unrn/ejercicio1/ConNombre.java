package unrn.ejercicio1;

public class ConNombre extends ArchivoDecorador {
    public ConNombre(ArchivoMostrable archivo) {
        super(archivo);
    }

    @Override
    public String prettyPrint() {
        return archivo.prettyPrint() + " " + nombre();
    }

}
