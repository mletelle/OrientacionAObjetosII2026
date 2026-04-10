package oop2.ejercicios.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Usuarios {

    private final String jdbcUrl;

    public Usuarios(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }

    // propia que permite throws SQLException.
    @FunctionalInterface
    private interface SqlAction {
        void execute(Connection connection) throws SQLException;
    }

    private void ejecutarEnTransaccion(SqlAction accion) {
        try (Connection connection = DriverManager.getConnection(this.jdbcUrl)) {
            connection.setAutoCommit(false);
            try {
                accion.execute(connection);
                connection.commit();
            } catch (SQLException e) {
                connection.rollback();
                throw new RuntimeException(e);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void insertar(String nombre, String email) {
        ejecutarEnTransaccion(connection -> {
            try (PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO usuarios (nombre, email) VALUES (?, ?)")) {
                statement.setString(1, nombre);
                statement.setString(2, email);
                statement.executeUpdate();
            }
        });
    }

    public void actualizarEmail(int id, String nuevoEmail) {
        ejecutarEnTransaccion(connection -> {
            try (PreparedStatement statement = connection.prepareStatement(
                    "UPDATE usuarios SET email = ? WHERE id = ?")) {
                statement.setString(1, nuevoEmail);
                statement.setInt(2, id);
                statement.executeUpdate();
            }
        });
    }
}