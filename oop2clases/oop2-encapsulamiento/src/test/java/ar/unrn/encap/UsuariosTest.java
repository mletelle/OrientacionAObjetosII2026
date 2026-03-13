package ar.unrn.encap;

import ar.unrn.encap.mal.Usuario;
import ar.unrn.encap.mal.UsuariosManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UsuariosTest {

    @Test
    public void cambioDeClaveOk() {
        var user1 = new Usuario();
        user1.setNombreUsuario("user1");
        user1.setClave("pwd123");

        var manager = new UsuariosManager();
        manager.cambiarClave(user1,
                "pwd123",
                "123pwd",
                "123pwd");

        assertEquals("123pwd", user1.getClave());
    }

    @Test
    public void cambioDeClaveContrasenaActualNoCoincide() {
        var user1 = new Usuario();
        user1.setNombreUsuario("user1");
        user1.setClave("pwd123");

        var manager = new UsuariosManager();
        assertThrows(RuntimeException.class, () -> {
            manager.cambiarClave(user1,
                    "pwd9993",
                    "123pwd",
                    "123pwd");
        });
        assertEquals("pwd123", user1.getClave());
    }

    @Test
    public void cambioDeClaveNuevaClaveNoCoincide() {
        var user1 = new Usuario();
        user1.setNombreUsuario("user1");
        user1.setClave("pwd123");

        var manager = new UsuariosManager();
        assertThrows(RuntimeException.class, () -> {
            manager.cambiarClave(user1,
                    "pwd123",
                    "123pwd",
                    "13pwd");
        });
        assertEquals("pwd123", user1.getClave());
    }
}
