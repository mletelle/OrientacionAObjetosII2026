package ar.unrn.encap.mal;

public class UsuariosManager {

    public void cambiarClave(Usuario u, String claveActual,
                             String nuevaClave, String nuevaClaveRepetida) {

        if (!u.getClave().equals(claveActual)) {
            throw new RuntimeException("No coincide con la actual...");
        }

        if (!nuevaClave.equals(nuevaClaveRepetida)) {
            throw new RuntimeException("No coinciden...");
        }

        u.setClave(nuevaClave);
    }
}

