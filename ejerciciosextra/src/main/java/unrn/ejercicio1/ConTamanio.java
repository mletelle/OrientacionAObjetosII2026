package unrn.ejercicio1;

public class ConTamanio extends ArchivoDecorador {
    public ConTamanio(ArchivoMostrable archivo) {
        super(archivo);
    }

    @Override
    public String prettyPrint() {
        return archivo.prettyPrint() + " " + String.valueOf(tamanio());
    }
}