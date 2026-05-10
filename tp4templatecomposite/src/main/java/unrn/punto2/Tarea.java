package unrn.punto2;

public class Tarea implements ItemProyecto {
    private int duracion;

    public Tarea(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public int calcularTiempo() {
        return duracion;
    }
}
