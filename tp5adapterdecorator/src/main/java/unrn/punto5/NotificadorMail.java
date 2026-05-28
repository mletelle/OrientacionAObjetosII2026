package unrn.punto5;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;

public class NotificadorMail implements Notificador {
    private final String host;
    private final int port;
    private final String username;
    private final String password;
    private final String from;

    public NotificadorMail(String host, int port, String username, String password, String from) {
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
        this.from = from;
    }

    @Override
    public void notificar(Participante participante) {
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

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(participante.getMail()));
            message.setSubject("Inscripcion confirmada");
            message.setText("Te inscribiste al concurso correctamente.");

            Transport.send(message);

            System.out.println("Email enviado a: " + participante.getMail());
        } catch (MessagingException e) {
            throw new RuntimeException("No se pudo enviar el email.", e);
        }
    }
}