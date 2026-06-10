package unrn.ejercicio5;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
    private State state;
    private String name;
    private Duration tiempoAcumulado;
    private Instant inicio;
    private List<String> comment;

    /**
     * Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
     */
    public ToDoItem(String name) {
        this.name = name;
        this.state = new Pending();
        this.tiempoAcumulado = Duration.ZERO;
        this.comment = new ArrayList<>();
    }

    /**
     * Pasa el ToDoItem a in-progress (siempre y cuando su estado actual sea
     * pending, si se encuentra en otro estado, no hace nada)
     */
    public void start() {
        this.state.arrancar(this);
    }

    /**
     * Pasa la tarea a paused si su estado es in-progress, o a in-progress si su
     * estado es paused. Caso contrario (pending o finished) genera un error
     * informando la causa específica del mismo
     */
    public void togglePause() {
        this.state.pausar(this);
    }

    /**
     * Pasa el ToDoItem a finished (siempre y cuando su estado actual sea
     * in-progress o pausada, si se encuentra en otro estado, no hace nada)
     */
    public void finish() {
        this.state.terminar(this);
    }

    /**
     * Retorna el tiempo que transcurrió desde que se inició la tarea (start)
     * hasta que se finalizó (descontando el tiempo que estuvo pausada). En caso
     * de que no esté finalizada, el tiempo que haya transcurrido hasta el
     * momento actual. Si la tarea no se inició o esta pausada, genera un error
     * informando la causa específica del mismo.
     */
    public Duration workedTime() {
        return state.duracion(this);
    }

    /**
     * Agrega un comentario a la tarea siempre y cuando no haya finalizado. Caso
     * contrario no hace nada.
     */
    public void addComment(String comment) {
        this.comment.add(comment);
    }

    public void aInProgress() {
        this.state = new Progress();
    }

    public void aPausar() {
        this.state = new Paused();
    }

    public void aFinalizar() {
        this.state = new Finished();
    }

    public void agregarComentario(String comentario) {
        this.comment.add(comentario);
    }

    public Duration tiempoTrabajado() {
        Duration tramo = Duration.between(inicio, Instant.now());
        return this.tiempoAcumulado.plus(tramo);
    }

    public Duration tiempoFinal() {
        return this.tiempoAcumulado;
    }
}
