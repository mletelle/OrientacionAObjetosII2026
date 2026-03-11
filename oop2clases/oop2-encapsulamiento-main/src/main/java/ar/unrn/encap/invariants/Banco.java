package ar.unrn.encap.invariants;


public class Banco {

    public void retirarDinero(CuentaBancaria cuenta, float saldo) {
        cuenta.retirar(saldo); // Ok, y deberia ser a unica posibilidad

        //dejar getters y setters me da la posibilidad de cometer estos errores
        //pudiendo no cumplir con la invariante: el saldo nunca puede ser negativo
        var saldoActual = cuenta.getSaldo();
        cuenta.setSaldo(saldoActual - saldo);
    }

    public void transferir(CuentaBancaria cuentaOrigen, CuentaBancaria cuentaDestino, float saldo) {
        //Por otro lado, es probable que empiece a duplicar código en Banco, por ejemplo:
        var saldoActualOrigen = cuentaOrigen.getSaldo();
        cuentaOrigen.setSaldo(saldoActualOrigen - saldo);

        var saldoActualDestino = cuentaDestino.getSaldo();
        cuentaDestino.setSaldo(saldoActualDestino + saldo);
//        vs
//        cuentaOrigen.retirar(saldo);
//        cuentaDestino.depositar(saldo);
    }
}

//Importante: duplicar es repetir lógica. Si mañana tengo que cobrar una comision al retirar,
// de la forma implementada con getters y setters, tengo que ir a cada lugar donde se hace un retiro y agregar
// la lógica de la comision, en cambio, si tengo el método retirar, solo tengo que agregar la lógica de la comision
// en ese método, y no tengo que preocuparme por los lugares donde se hace un retiro, lo que hace que el código sea más
// fácil de mantener y por ende menos propenso a errores.

