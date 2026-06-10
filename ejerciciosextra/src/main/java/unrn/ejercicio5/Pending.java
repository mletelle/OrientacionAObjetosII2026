package unrn.ejercicio5;

import java.time.Duration;

public class Pending implements State {
    @Override
    public void arrancar(ToDoItem toDoItem) {
        toDoItem.aInProgress();
    }

    @Override
    public void pausar(ToDoItem toDoItem) {
        throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
    }

    @Override
    public void terminar(ToDoItem toDoItem) {
        throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
    }

    @Override
    public void agregarComentario(ToDoItem toDoItem, String comentario) {
        toDoItem.agregarComentario(comentario);
    }

    @Override
    public Duration duracion(ToDoItem toDoItem) {
        throw new RuntimeException("El objeto ToDoItem no se encuentra iniciado");
    }
}
