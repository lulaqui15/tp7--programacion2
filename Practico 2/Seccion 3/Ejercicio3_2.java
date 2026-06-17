import java.util.ArrayDeque;

public class Ejercicio3_2 {
    public static void main(String[] args) {

        ArrayDeque<String> deque = new ArrayDeque<>();

        //Agregar elementos al inicio y al final
        deque.addFirst("Inicio 1");
        deque.addLast("Final 1");
        deque.addFirst("Inicio 2");
        deque.addLast("Final 2");

        System.out.println("Deque actual: " + deque);

        //Eliminamos elementos de los extremos
        String primero = deque.removeFirst();
        String ultimo = deque.removeLast();

        System.out.println("Elemento removido del inicio: " + primero);
        System.out.println("Elemento removido del final: " + ultimo);

        System.out.println("Deque final: " + deque);
    }
}