package ar.unrn.telldontask.paperboy;

public class Cliente {
    private String nombre;
    private Billetera billetera;


    public Cliente(String nombre, Billetera billetera) {
        this.nombre = nombre;
        this.billetera = billetera;
    }

    public Billetera getBilletera() {
        return billetera;
    }

//    public void pagar(float saldoACobrar) {
//        this.billetera.sacarEfectivo(saldoACobrar);
//    }
}
