package unrn.ejercicio1;

public class ConExtension extends ArchivoDecorador {
    public ConExtension(ArchivoMostrable archivo) {
        super(archivo);
    }

    @Override
    public String prettyPrint() {
        return archivo.prettyPrint() + " " + extension();
    }
}
