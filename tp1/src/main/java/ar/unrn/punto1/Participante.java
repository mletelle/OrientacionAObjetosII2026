package ar.unrn.punto1;

public class Participante {
    private final String nombre;
    private int puntos;

    public Participante(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
    }

    public void agregarPuntos(int puntos) {
        this.puntos += puntos;
    }

    public void bonificarInscripcion() {
        this.agregarPuntos(10);
    }

    public int cuantosPuntos() {
        return puntos;
    }
}
