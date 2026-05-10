package unrn.punto3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemSeguroTest {
    @Test
    public void testCalcularMontoPaqueteSimple() {
        Seguro seguro1 = new Seguro(TipoSeguro.HOGAR, 1000);
        Seguro seguro2 = new Seguro(TipoSeguro.AUTO, 1000);
        Seguro seguro3 = new Seguro(TipoSeguro.VIDA, 1000);
        Seguro seguro4 = new Seguro(TipoSeguro.MEDICO, 1000);
        PaqueteSeguro paquete = new PaqueteSeguro();

        paquete.agregarSeguro(seguro1);
        paquete.agregarSeguro(seguro2);
        paquete.agregarSeguro(seguro3);
        paquete.agregarSeguro(seguro4);
        //(1000 × 0.95) × 4
        assertEquals(3800, paquete.calcularMonto(), 0.01);
    }

    @Test
    public void testCalcularMontoPaqueteCompuesto() {
        Seguro seguro1 = new Seguro(TipoSeguro.HOGAR, 1000);
        Seguro seguro2 = new Seguro(TipoSeguro.AUTO, 1000);
        Seguro seguro3 = new Seguro(TipoSeguro.VIDA, 1000);
        Seguro seguro4 = new Seguro(TipoSeguro.MEDICO, 1000);
        Seguro seguro5 = new Seguro(TipoSeguro.HOGAR, 1000);
        PaqueteSeguro paqueteSeguro1 = new PaqueteSeguro();
        PaqueteSeguro paqueteSeguro2 = new PaqueteSeguro();

        paqueteSeguro1.agregarSeguro(seguro1);
        paqueteSeguro1.agregarSeguro(seguro2);
        paqueteSeguro1.agregarSeguro(seguro3);
        paqueteSeguro1.agregarSeguro(seguro4);
        paqueteSeguro2.agregarSeguro(seguro5);
        paqueteSeguro1.agregarSeguro(paqueteSeguro2);
        //4×(1000×0.95) + (1000×0.95)×0.95
        assertEquals(4702.5, paqueteSeguro1.calcularMonto());
    }

}