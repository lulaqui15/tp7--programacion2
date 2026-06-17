
import java.util.function.*;

public class Ejercicio1_1 {
    public static void main(String[] args) {

        //Verificacion
        Predicate<Integer> esPar = n -> n % 2 == 0;
        System.out.println("¿Es par 4? " + esPar.test(4));

        //Longitud
        Function<String, Integer> longitud = s -> s.length();
        System.out.println("Longitud de 'Hola': " + longitud.apply("Hola"));

        //Consumer → imprimir número
        Consumer<Integer> imprimir = n -> System.out.println("Número: " + n);
        imprimir.accept(10);

        //Supplier → número aleatorio
        Supplier<Double> aleatorio = () -> Math.random();
        System.out.println("Número aleatorio: " + aleatorio.get());
    }
}