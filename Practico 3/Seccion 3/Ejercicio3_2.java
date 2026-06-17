import java.util.stream.Stream;

public class Ejercicio3_2 {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Juan", "Maria", "Ana");

        //Convertimos a longitud y sumamos
        int suma = nombres
            .mapToInt(s -> s.length())
            .sum();

        System.out.println("Suma total de letras: " + suma);
    }
}