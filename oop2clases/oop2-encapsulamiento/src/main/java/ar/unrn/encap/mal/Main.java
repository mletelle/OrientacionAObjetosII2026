package ar.unrn.encap.mal;

public class Main {

    public static void main(String[] args) {
        UsuariosManager manager = new UsuariosManager();
        Usuario u = new Usuario();
        u.setNombreUsuario("pepe");
        u.setClave("1234");

        manager.cambiarClave(u, "1234", "12345", "12345");
        System.out.println("Clave cambiada correctamente");
    }
}
