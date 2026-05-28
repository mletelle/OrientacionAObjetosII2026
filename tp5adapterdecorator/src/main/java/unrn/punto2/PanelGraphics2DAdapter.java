package unrn.punto2;

import java.awt.*;

public class PanelGraphics2DAdapter implements Panel {
    private final Graphics2D g2d;

    public PanelGraphics2DAdapter(Graphics2D g2d) {
        this.g2d = g2d;
    }

    @Override
    public void dibujarCirculo(Coordenada coordenada, double radio) {
        int x = convertirAEntero(coordenada.x() - radio);
        int y = convertirAEntero(coordenada.y() - radio);
        int diametro = convertirAEntero(radio * 2);

        g2d.drawOval(x, y, diametro, diametro);
    }

    @Override
    public void dibujarLinea(Coordenada coordenada, double longitud) {
        int xInicial = convertirAEntero(coordenada.x());
        int yInicial = convertirAEntero(coordenada.y());
        int xFinal = convertirAEntero(coordenada.x() + longitud);
        int yFinal = convertirAEntero(coordenada.y());

        g2d.drawLine(xInicial, yInicial, xFinal, yFinal);
    }

    @Override
    public void dibujarTexto(Coordenada coordenada, String texto) {
        int x = convertirAEntero(coordenada.x());
        int y = convertirAEntero(coordenada.y());

        g2d.drawString(texto, x, y);
    }

    private int convertirAEntero(double valor) {
        return (int) Math.round(valor);
    }
}
