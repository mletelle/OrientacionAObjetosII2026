package servicio;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import modelo.Notificador;

import java.util.Properties;

public class NotificacionPorEmail implements Notificador {

    private final String host;
    private final int port;
    private final String username;
    private final String password;
    private final String from;

    public NotificacionPorEmail(String host, int port, String username, String password, String from) {
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
        this.from = from;
    }

    @Override
    public void enviarSaludo(String email, String mensaje) {
        try {
            Properties properties = new Properties();
            properties.put("mail.smtp.host", host);
            properties.put("mail.smtp.port", String.valueOf(port));
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            Session session = Session.getInstance(properties, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(email));
            message.setSubject("Feliz Cumplea");
            message.setText(mensaje);
            Transport.send(message);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
