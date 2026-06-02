package unrn.concurso.servicio;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import unrn.concurso.modelo.ObservadorInscripcion;
import unrn.concurso.modelo.Participante;

import java.util.Properties;

public class ObservadorEmailInscripcion implements ObservadorInscripcion {
    private String host;
    private int port;
    private String username;
    private String password;
    private String from;

    public ObservadorEmailInscripcion(String host, int port, String username, String password, String from) {
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
        this.from = from;
    }

    @Override
    public void actualizar(Participante participante) {
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
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(participante.emailParticipante()));
            message.setSubject("Inscripcion confirmada");
            message.setText("Hola " + participante.nombreParticipante() + ", tu inscripcion fue registrada.");

            Transport.send(message);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
