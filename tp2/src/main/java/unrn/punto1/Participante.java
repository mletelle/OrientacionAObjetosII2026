package unrn.punto1;

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

    public int cuantosPuntos() {
        return this.puntos;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Participante that = (Participante) obj;
        return puntos == that.puntos && nombre.equals(that.nombre);
    }
}
