import java.util.List;
import java.util.LinkedList;

public class Ejercicio2_2 {
    public static void main(String[] args) {

        //Inmutable List
        List<String> listaInmutable = List.of("A", "B", "C");

        System.out.println("Lista inmutable: " + listaInmutable);

        //Intenta, pero larga un Exception
        try {
            listaInmutable.add("D");
        } catch (UnsupportedOperationException e) {
            System.out.println("No se puede modificar la lista inmutable");
        }

        //Lo convertimos a LinkedList-mutable
        LinkedList<String> listaMutable = new LinkedList<>(listaInmutable);

        
        listaMutable.add(1, "X"); 

        System.out.println("Lista mutable (LinkedList): " + listaMutable);
    }
}