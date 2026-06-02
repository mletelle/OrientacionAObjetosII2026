package ar.unrn.persistencia;

import ar.unrn.modelo.Registrar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCRegistrarParticipantes implements Registrar {
    private Connection conn;

    public JDBCRegistrarParticipantes() throws SQLException {
        setupBaseDeDatos();
    }

    private void setupBaseDeDatos() throws SQLException {
        String url = "jdbc:sqlite:participantes.db";
        this.conn = DriverManager.getConnection(url);

        String createTable = "CREATE TABLE IF NOT EXISTS participantes (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nombre TEXT NOT NULL, " +
                "telefono TEXT NOT NULL, " +
                "region TEXT NOT NULL)";

        try (PreparedStatement st = conn.prepareStatement(createTable)) {
            st.executeUpdate();
        }
    }

    @Override
    public void guardarParticipante(String nombre, String telefono, String region) {
        String sql = "insert into participantes(nombre, telefono, region) values(?,?,?)";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, nombre);
            st.setString(2, telefono);
            st.setString(3, region);
            st.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
