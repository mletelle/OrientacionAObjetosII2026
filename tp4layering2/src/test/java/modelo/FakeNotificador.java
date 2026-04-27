package modelo;

public class FakeNotificador implements Notificador {
    private String ultimoEmail;

    @Override
    public void enviarSaludo(String email, String mensaje) {
        this.ultimoEmail = email;
    }

    public String ultimoEmailEnviado() {
        return ultimoEmail;
    }
}