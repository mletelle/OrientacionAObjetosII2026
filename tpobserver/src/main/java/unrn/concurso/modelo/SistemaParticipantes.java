package ar.unrn.modelo;

public class SistemaParticipantes {
    private Registrar registrar;

    public SistemaParticipantes(Registrar registrar) {
        this.registrar = registrar;
    }

    public void agregarParticipante(String nombre, String telefono, String region) {

        new Participante(nombre, region, telefono);

        registrar.guardarParticipante(nombre, telefono, region);

    }
}
