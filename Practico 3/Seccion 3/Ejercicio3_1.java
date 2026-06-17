import java.util.stream.Stream;

public class Ejercicio3_1 {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Juan", "Maria", "Ana");

        //Transformamos a Mayus..
        nombres
            .map(s -> s.toUpperCase())
            .forEach(s -> System.out.println(s));
    }
}