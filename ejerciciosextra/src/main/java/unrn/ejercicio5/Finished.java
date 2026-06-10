package unrn.ejercicio5;

import java.time.Duration;

public class Finished implements State {
    @Override
    public void arrancar(ToDoItem toDoItem) {
        throw new RuntimeException("El objeto ToDoItem ya estaba arrancado");
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
        throw new RuntimeException("El objeto ToDoItem ya estaba terminado");
    }

    @Override
    public Duration duracion(ToDoItem toDoItem) {
        return toDoItem.tiempoFinal();
    }
}
