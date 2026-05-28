package unrn.punto2;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        Canvas canvas = new Canvas();
        canvas.agregarFigura(new Linea(200, new Coordenada(50, 50)));
        canvas.agregarFigura(new Circulo(50, new Coordenada(200, 200)));
        canvas.agregarFigura(new Texto(new Coordenada(100, 300), "Hola Mundo"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        getContentPane().add(canvas);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        });
    }
}