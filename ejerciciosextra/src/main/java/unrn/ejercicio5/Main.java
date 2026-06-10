package unrn.ejercicio5;

public class Main {
    public static void main(String[] args) {
        ToDoItem td = new ToDoItem("hola");
        td.start();
        td.addComment("chau");
        td.togglePause();
        td.togglePause();
        td.finish();
    }
}
