package unrn.punto1;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class PersonaDao {
    private Connection obtenerConexion() {
        try {
            return DriverManager.getConnection("jdbc:sqlite:personas.db");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Set<Telefono> telefonosPorIdPersona(int idPersona) {
        String sql = "select numero from telefonos where idPersona = ?";
        try (Connection conn = obtenerConexion();
             PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, idPersona);
            ResultSet result = statement.executeQuery();
            Set<Telefono> telefonos = new HashSet<>();
            while (result.next()) {
                telefonos.add(new Telefono(result.getString("numero")));
            }
            return telefonos;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Persona personaPorId(int id) {
        String sql = "select nombre from personas where id = ?";
        try (Connection conn = obtenerConexion(); PreparedStatement statement = conn.prepareStatement(sql);) {
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            Set<Telefono> telefonos = new TelefonosProxy(this, id);
            String nombrePersona = null;
            while (result.next()) {
                nombrePersona = result.getString(1);
            }
            return new Persona(id, nombrePersona, telefonos);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}