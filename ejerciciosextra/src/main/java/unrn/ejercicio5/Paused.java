package unrn.ejercicio5;

import java.time.Duration;

public class Paused implements State {
    @Override
    public void arrancar(ToDoItem toDoItem) {
        throw new RuntimeException("El objeto ToDoItem ya estaba arrancado");
    }

    @Override
    public void pausar(ToDoItem toDoItem) {
        toDoItem.aInProgress();
    }

    @Override
    public void terminar(ToDoItem toDoItem) {
        toDoItem.aFinalizar();
    }

    @Override
    public void agregarComentario(ToDoItem toDoItem, String comentario) {
        toDoItem.agregarComentario(comentario);
    }

    @Override
    public Duration duracion(ToDoItem toDoItem) {
        return toDoItem.tiempoTrabajado();
    }
}
