package ar.unrn.telldontask.paperboy;

public class Billetera {
    private float efectivo;

    public Billetera(float efectivo) {
        this.efectivo = efectivo;
    }

    public void sacarEfectivo(float efectivo) {
        if (this.efectivo < efectivo) {
            throw new RuntimeException("No hay efectivo suficiente");
        }
        this.efectivo -= efectivo;
    }
}
