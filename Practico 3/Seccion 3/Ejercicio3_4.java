
import java.util.stream.Stream;
import java.util.Comparator;

public class Ejercicio3_4 {
    public static void main(String[] args) {

        //Orden Natural
        System.out.println("Orden natural:");
        Stream.of("Juan", "Maria", "Ana", "Pedro")
                .sorted()
                .forEach(s -> System.out.println(s));

        //Orden por Longitud
        System.out.println("\nOrden por longitud:");
        Stream.of("Juan", "Maria", "Ana", "Pedro")
                .sorted((a, b) -> a.length() - b.length())
                .forEach(s -> System.out.println(s));
    }
}