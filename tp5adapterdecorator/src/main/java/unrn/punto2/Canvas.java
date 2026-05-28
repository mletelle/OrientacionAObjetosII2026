package unrn.punto2;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

class Canvas extends JPanel {
    private List<Figura> figuras;

    public Canvas() {
        figuras = new ArrayList<>();
    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        Panel panel = new PanelGraphics2DAdapter(g2d);
        for (Figura figura : figuras) {
            figura.dibujar(panel);
        }
    }
}