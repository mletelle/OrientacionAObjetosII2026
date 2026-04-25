package oop2.tp3.ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//REGULARES: monto = 2.0 + max(0, (dias-2)) * 1.5
//NUEVO_LANZAMIENTO: monto = dias * 3.0
//INFANTILES: monto = 1.5 + max(0, (dias-3)) * 1.5
//Puntos 1 por alquiler y si es NUEVO_LANZAMIENTO y dias>1 suma +1
public class BibliotecaTest {
    @Test
    public void alquilerRegularSemana() {
        Libro agujerosNegros = new LibroRegular("Agujeros Negros");
        Libro juanArco = new LibroRegular("Juana de Arco");
        CopiaLibro agujerosNegrosCopia = new CopiaLibro(agujerosNegros);
        CopiaLibro juanArcoCopia = new CopiaLibro(juanArco);
        Alquiler alquilerAgujerosNegros = new Alquiler(agujerosNegrosCopia, 7);
        Alquiler alquilerjuanArco = new Alquiler(juanArcoCopia, 7);
        Cliente yo = new Cliente("Pepe");
        yo.alquilar(alquilerAgujerosNegros);
        yo.alquilar(alquilerjuanArco);
        Object[] res = yo.calcularDeudaYPuntosObtenidos();
        assertEquals(19, (Double) res[0], 0.001);
        assertEquals(2, ((Integer) res[1]).intValue());
    }

    @Test
    void alquilerRegularUnDia() {
        Libro libro1984 = new LibroRegular("1984");
        Cliente c = new Cliente("Pedrito");
        c.alquilar(new Alquiler(new CopiaLibro(libro1984), 1));
        Object[] res = c.calcularDeudaYPuntosObtenidos();
        assertEquals(2.0, (Double) res[0], 0.001);
        assertEquals(1, ((Integer) res[1]).intValue());
    }


    @Test
    void alquilerRegularTresDia() {
        Libro hushHush = new LibroRegular("Hush Hush");
        Cliente c = new Cliente("Marcelo");
        c.alquilar(new Alquiler(new CopiaLibro(hushHush), 3));
        Object[] res = c.calcularDeudaYPuntosObtenidos();
        assertEquals(3.5, (Double) res[0], 0.001);
        assertEquals(1, ((Integer) res[1]).intValue());
    }

    @Test
    void alquilerNuevoDosDias() {
        Libro orgulloPrejuicio = new LibroNuevoLanzamiento("Orgullo y Prejuicio");
        Cliente c = new Cliente("Andres");
        c.alquilar(new Alquiler(new CopiaLibro(orgulloPrejuicio), 2));
        Object[] res = c.calcularDeudaYPuntosObtenidos();
        assertEquals(6, (Double) res[0], 0.001);
        assertEquals(2, ((Integer) res[1]).intValue());
    }

    @Test
    void alquilerNuevoUnDia() {
        Libro orgulloPrejuicio = new LibroNuevoLanzamiento("Orgullo y Prejuicio");
        Cliente c = new Cliente("Andres");
        c.alquilar(new Alquiler(new CopiaLibro(orgulloPrejuicio), 1));
        Object[] res = c.calcularDeudaYPuntosObtenidos();
        assertEquals(3, (Double) res[0], 0.001);
        assertEquals(1, ((Integer) res[1]).intValue());
    }

    @Test
    void alquilerInfantilUnDia() {
        Libro elPrincipito = new LibroInfantil("El Principito");
        Cliente c = new Cliente("Micaela");
        c.alquilar(new Alquiler(new CopiaLibro(elPrincipito), 1));
        Object[] res = c.calcularDeudaYPuntosObtenidos();
        assertEquals(1.5, (Double) res[0], 0.001);
        assertEquals(1, ((Integer) res[1]).intValue());
    }

    @Test
    void alquilerInfantilCuatroDias() {
        Libro vacaLola = new LibroInfantil("Vaca Lola");
        Cliente c = new Cliente("Raul");
        c.alquilar(new Alquiler(new CopiaLibro(vacaLola), 4));
        Object[] res = c.calcularDeudaYPuntosObtenidos();
        assertEquals(3, (Double) res[0], 0.001);
        assertEquals(1, ((Integer) res[1]).intValue());
    }
}
