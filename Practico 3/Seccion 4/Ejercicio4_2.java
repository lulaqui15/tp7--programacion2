
import java.util.Optional;
import java.util.stream.Stream;

public class Ejercicio4_2 {
    public static void main(String[] args) {

        Optional<Integer> resultado = Stream.of(2, 5, 7, 3, 6, 2, 3)
                .filter(n -> n % 2 == 0) // solo pares
                .findFirst(); // primer resultado

        if (resultado.isPresent()) {
            System.out.println("Número encontrado: " + resultado.get());
        } else {
            System.out.println("No se encontró ningún número par");
        }
    }
}