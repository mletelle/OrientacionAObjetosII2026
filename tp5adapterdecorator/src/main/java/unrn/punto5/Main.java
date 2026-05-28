package unrn.punto5;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Registrador registrador = (participante, concurso) -> {
            System.out.println("Inscripcion registrada participante " + participante.getId() + ", concurso " + concurso.getId());
        };
        Notificador notificadorMail = new NotificadorMail("sandbox.smtp.mailtrap.io", 2525, "2372cd9060f4e7", "4dea3ceb1dc317", "concurso@tp5.com"
        );
        Participante juan = new Participante(42, "Juan", "mail@mail.com");
        Inscribible concurso = new Concurso(1, "Concurso de Programacion", LocalDate.now().minusDays(1), LocalDate.now().plusDays(10), registrador
        );
        Inscribible concursoConMail = new ConcursoConNotificacionMail(concurso, notificadorMail);
        concursoConMail.inscribirA(juan);
        System.out.println("Esta inscripto  " + concursoConMail.estaInscripto(juan));
    }
}