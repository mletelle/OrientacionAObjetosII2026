package ar.unrn.telldontask.tren;

import java.util.List;

public class Tren {
    private List<Bagon> bagones;
    private int limiteOcupacion = 70;

    public void reservarAsiento(PedidoReserva pedido) {
        for (Bagon bagon : bagones) {
            //invirtamos la logica para que el tren no sepa nada de asientos, solo de bagones
            if (bagon.getAsientos().getPorcentajeRes() < limiteOcupacion) {
                pedido.reservarAsientoEn(bagon);
                return;
            }
        }
        pedido.noSeEncuentranAsientos();
    }
}
