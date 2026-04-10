package unrn.punto1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class RegistradorBD implements Registrador {
    private final String url;

    //sqlite
    public RegistradorBD(String url) {
        this.url = url;
    }

    public void registrar(Participante participante, Concurso concurso) {
        try {
            Connection conn = DriverManager.getConnection(url);
            PreparedStatement ps = conn.prepareStatement("INSERT INTO inscripciones(fecha,id_participante,id_concurso) VALUES(?, ?, ?)");
            ps.setString(1, LocalDate.now().toString());
            ps.setInt(2, participante.getId());
            ps.setInt(3, concurso.getId());
            ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

