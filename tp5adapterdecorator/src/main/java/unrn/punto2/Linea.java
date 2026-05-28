package unrn.punto2;

public class Linea implements Figura {
    private double longitud;
    private Coordenada coordenada;

    public Linea(double longitud, Coordenada coordenada) {
        this.longitud = longitud;
        this.coordenada = coordenada;
    }

    @Override
    public void dibujar(Panel panel) {
        panel.dibujarLinea(coordenada, longitud);
    }
}
