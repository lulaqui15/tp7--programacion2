
import java.util.stream.Stream;

public class Ejercicio2_2 {
    public static void main(String[] args) {

        long cantidad = Stream.of(1, 2, 3, 4, 5, 6) 
            .filter(n -> n > 3) //solo mayores a 3  
            .peek(n -> System.out.println("Procesando: " + n)) 
            .count(); //operación final

        System.out.println("Cantidad final: " + cantidad);
    }
}