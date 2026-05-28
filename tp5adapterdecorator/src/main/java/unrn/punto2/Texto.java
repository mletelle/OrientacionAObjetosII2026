package unrn.punto2;

public class Texto implements Figura {
    private Coordenada coordenada;
    private String texto;

    public Texto(Coordenada coordenada, String texto) {
        this.coordenada = coordenada;
        this.texto = texto;
    }

    @Override
    public void dibujar(Panel panel) {
        panel.dibujarTexto(coordenada, texto);
    }
}
