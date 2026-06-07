package unrn.punto2.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Aspect
public class LogAspect {

    @Before("execution(@unrn.punto2.log.Log * *(..))")
    public void loguear(JoinPoint joinPoint) {
        String metodo = joinPoint.getSignature().getName();
        String parametros = "sin parametros";
        Object[] argumentos = joinPoint.getArgs();

        if (argumentos.length > 0) {
            parametros = String.valueOf(argumentos[0]);
            for (int i = 1; i < argumentos.length; i++) {
                parametros += "|" + argumentos[i];
            }
        }
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String fechaHora = LocalDateTime.now().format(formato);
        String linea = "\"" + metodo + "\", \"" + parametros + "\", \"" + fechaHora + "\"\n";
        try {
            Files.writeString(Paths.get("src/main/resources/log.txt"), linea, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Error guardando log: " + e.getMessage());
        }
    }
}
