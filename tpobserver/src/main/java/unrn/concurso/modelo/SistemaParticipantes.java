package unrn.concurso.modelo;

import java.util.ArrayList;
import java.util.List;

public class SistemaParticipantes {
    private Registrar registrar;
    private List<ObservadorInscripcion> observadores = new ArrayList<>();

    public SistemaParticipantes(Registrar registrar) {
        this.registrar = registrar;
    }

    public void agregarObservador(ObservadorInscripcion observador) {
        this.observadores.add(observador);
    }

    public void agregarParticipante(String nombre, String telefono, String region, String email) {
        Participante participante = new Participante(nombre, region, telefono, email);

        registrar.guardarParticipante(
                participante.nombreParticipante(),
                participante.telefonoParticipante(),
                participante.regionParticipante(),
                participante.emailParticipante()
        );

        this.notificar(participante);
    }

    private void notificar(Participante participante) {
        for (ObservadorInscripcion observador : observadores) {
            observador.actualizar(participante);
        }
    }
}
