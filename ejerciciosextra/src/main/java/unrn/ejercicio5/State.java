package unrn.ejercicio5;

import java.time.Duration;

public interface State {
    void arrancar(ToDoItem toDoItem);

    void pausar(ToDoItem toDoItem);

    void terminar(ToDoItem toDoItem);

    void agregarComentario(ToDoItem toDoItem, String comentario);

    Duration duracion(ToDoItem toDoItem);
}
