package unrn;

import unrn.punto1.Concurso;
import unrn.punto1.Participante;
import unrn.punto2.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

public class Main {
    static final String URL = "jdbc:sqlite:tp2.db";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL); var ps = conn.createStatement()) {
            ps.execute("CREATE TABLE IF NOT EXISTS inscripciones (" + "id INTEGER PRIMARY KEY AUTOINCREMENT, " + "fecha TEXT, " + "id_participante INTEGER, " + "id_concurso INTEGER)");
            ps.execute("CREATE TABLE IF NOT EXISTS ventas (" + "id INTEGER PRIMARY KEY AUTOINCREMENT, " + "fecha TEXT, " + "total REAL)");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        // punto 1
        var registradorConcurso = new unrn.punto1.RegistradorBD(URL);
        var notificadorConcurso = new unrn.punto1.NotificadorMail("sandbox.smtp.mailtrap.io", 2525, "2372cd9060f4e7", "4dea3ceb1dc317", "concurso@tp2.com");// borrar credenciales antes de subir a github
        Concurso concurso = new Concurso(1, "Concurso de Programación", LocalDate.now().minusDays(1), LocalDate.now().plusDays(10), registradorConcurso, notificadorConcurso);
        Participante juan = new Participante(42, "Juan", "mail@mail.com");
        concurso.inscribirA(juan);
        // punto 2
        var registradorResto = new unrn.punto2.RegistradorDB(URL);
        Pedido pedido = new Pedido(Tarjeta.VISA, Propina.CINCO, registradorResto);
        pedido.agregarProducto(new Bebida(500));
        pedido.agregarProducto(new Bebida(200));
        pedido.agregarProducto(new Plato(2000));
        pedido.agregarProducto(new Plato(1000));
        pedido.calcularPrecioTotal();
    }
}
