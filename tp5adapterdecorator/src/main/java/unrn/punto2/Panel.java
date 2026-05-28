package unrn.punto2;

public interface Panel {
    public void dibujarCirculo(Coordenada coordenada, double radio);

    public void dibujarLinea(Coordenada coordenada, double longitud);

    public void dibujarTexto(Coordenada coordenada, String texto);
}
