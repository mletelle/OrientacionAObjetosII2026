package ar.unrn.telldontask.paperboy;

public class Diarero {

    public void cobrar(Cliente unCliente, float saldoACobrar) {
        //El diarero saca del bolsillo del cliente la billetera y se cobra.
        //el diarero ahora sabe que el Cliente tiene una billetera
        //Diarero, Cliente y Billetera estan acopladas
        var billetera = unCliente.getBilletera();
        billetera.sacarEfectivo(saldoACobrar);

        //modelamos mejor la vida real
        //Diarero no tiene idea si el cliente paga con una Billetera, con mercado Pago o como sea.
        //unCliente.pagar(saladoACobrar);
    }
}
