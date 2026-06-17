import java.util.stream.Stream;

public class Ejercicio4_1 {
    public static void main(String[] args) {

        boolean hayMayorA5 = Stream.of(2, 5, 7, 3, 6, 2, 3)
                .anyMatch(n -> n > 5);

        System.out.println("¿Hay algún número mayor a 5? " + hayMayorA5);

        boolean todosMayoresA1 = Stream.of(2, 5, 7, 3, 6, 2, 3)
                .allMatch(n -> n > 1);

        System.out.println("¿Todos son mayores a 1? " + todosMayoresA1);

        boolean ningunoNegativo = Stream.of(2, 5, 7, 3, 6, 2, 3)
                .noneMatch(n -> n < 0);

        System.out.println("¿Ninguno es negativo? " + ningunoNegativo);
    }
}