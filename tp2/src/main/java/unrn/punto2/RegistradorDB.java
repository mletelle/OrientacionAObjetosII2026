package unrn.punto2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class RegistradorDB implements Registrador {
    private final String url;

    public RegistradorDB(String url) {
        this.url = url;
    }

    @Override
    public void registrar(double total) {
        try {
            Connection conn = DriverManager.getConnection(url);
            PreparedStatement ps = conn.prepareStatement("INSERT INTO ventas(fecha,total) VALUES(?, ?)");
            ps.setString(1, LocalDate.now().toString());
            ps.setDouble(2, total);
            ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
