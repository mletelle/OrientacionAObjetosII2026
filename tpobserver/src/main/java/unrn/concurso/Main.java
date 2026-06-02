package ar.unrn;

import ar.unrn.modelo.Registrar;
import ar.unrn.modelo.SistemaParticipantes;
import ar.unrn.persistencia.JDBCRegistrarParticipantes;
import ar.unrn.vista.AgregarParticipante;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Registrar registrar = new JDBCRegistrarParticipantes();
                SistemaParticipantes sistema = new SistemaParticipantes(registrar);
                AgregarParticipante agregar = new AgregarParticipante(sistema);
                agregar.setVisible(true);

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }
}