package unrn.punto2;

public class Circulo implements Figura {
    private double radio;
    private Coordenada coordenada;

    public Circulo(double radio, Coordenada coordenada) {
        this.radio = radio;
        this.coordenada = coordenada;
    }

    @Override
    public void dibujar(Panel panel) {
        panel.dibujarCirculo(coordenada, radio);
    }
}
