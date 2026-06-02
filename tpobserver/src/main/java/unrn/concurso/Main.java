package unrn.concurso;

import unrn.concurso.modelo.Registrar;
import unrn.concurso.modelo.SistemaParticipantes;
import unrn.concurso.persistencia.JDBCRegistrarParticipantes;
import unrn.concurso.servicio.ObservadorEmailInscripcion;
import unrn.concurso.vista.AgregarParticipante;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Registrar registrar = new JDBCRegistrarParticipantes();
                SistemaParticipantes sistema = new SistemaParticipantes(registrar);
                sistema.agregarObservador(new ObservadorEmailInscripcion(
                        "sandbox.smtp.mailtrap.io",
                        2525,
                        "2372cd9060f4e7",
                        "4dea3ceb1dc317",
                        "concurso@tp2.com"
                ));
                AgregarParticipante agregar = new AgregarParticipante(sistema);
                agregar.setVisible(true);

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }
}
