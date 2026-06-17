
import java.util.stream.Stream;

public class Ejercicio2_1 {
    public static void main(String[] args) {

        long cantidad = Stream.of(2, 5, 3, 3, 6, 2, 4)
                .distinct()   // elimina duplicados
                .skip(1)      // salta el primero
                .limit(3)     // toma los siguientes 3
                .count();     // cuenta

        System.out.println("Cantidad de elementos: " + cantidad);
    }
}