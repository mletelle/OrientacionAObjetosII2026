package unrn.procedural;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RevisionTecnicaVehicularTest {

    @Test
    public void costoDeRevisionAuto() {
        int value = 2024;
        var costo = RevisionTecnicaVehicular.calcularCostoRevisionParaAnio("auto", 2015, false, -1, value);
        assertEquals(10090, costo, 0.0);
    }

    @Test
    public void costoDeRevisionPickUp() {
        int value = 2024;
        var costo = RevisionTecnicaVehicular.calcularCostoRevisionParaAnio("pickup", 2015, true, -1, value);
        assertEquals(17000, costo, 0.0);
    }

    @Test
    public void costoDeRevisionTransporte() {
        int value = 2024;
        var costo = RevisionTecnicaVehicular.calcularCostoRevisionParaAnio("transporte pasajeros", 2015, false, 55, value);
        assertEquals(57500, costo, 0.0);
    }
}
