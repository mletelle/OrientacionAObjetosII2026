package unrn.punto2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemProyectoTest {

    @Test
    void calcularTiempoTresTareas() {
        Proyecto p = new Proyecto();
        Tarea t1 = new Tarea(10);
        Tarea t2 = new Tarea(20);
        Tarea t3 = new Tarea(30);
        p.agregarItem(t1);
        p.agregarItem(t2);
        p.agregarItem(t3);
        assertEquals(60, p.calcularTiempo());
    }

    @Test
    void calcularTiempoTareasHistorias() {
        Proyecto p = new Proyecto();
        HistoriaUsuario h1 = new HistoriaUsuario();
        HistoriaUsuario h2 = new HistoriaUsuario();
        Tarea t1 = new Tarea(10);
        Tarea t2 = new Tarea(20);
        Tarea t3 = new Tarea(30);
        Tarea t4 = new Tarea(10);
        h1.agregarItem(t1);
        h1.agregarItem(t2);
        h2.agregarItem(t3);
        p.agregarItem(t4);
        p.agregarItem(h1);
        p.agregarItem(h2);
        assertEquals(70, p.calcularTiempo());
    }
}