package unrn.punto1;

public class Puerta {
    private EstadoPuerta estado;

    public Puerta() {
        this.estado = new EstadoCerrada(this);
    }

    public String estado() {
        return this.estado.nombre();
    }

    void estadoCambio(EstadoPuerta estadoNuevo) {
        this.estado = estadoNuevo;
    }

    public void abrir() {
        estado.abrir();
    }

    public void cerrar() {
        estado.cerrar();
    }
}
