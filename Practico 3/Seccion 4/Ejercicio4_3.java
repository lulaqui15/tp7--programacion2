
import java.util.Optional;
import java.util.stream.Stream;

public class Ejercicio4_3 {
    public static void main(String[] args) {

        Optional<Integer> suma = Stream.of(2, 5, 7, 3, 6)
                .reduce((a, b) -> a + b);

        if (suma.isPresent()) {
            System.out.println("Suma total: " + suma.get());
        }
    }
}