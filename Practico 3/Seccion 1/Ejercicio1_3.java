
import java.util.function.IntPredicate;
import java.util.function.ToIntFunction;

public class Ejercicio1_3 {
    public static void main(String[] args) {

        //IntPredicate
        IntPredicate esPar = n -> n % 2 == 0;
        System.out.println("¿Es par 8? " + esPar.test(8));

        //ToIntFunction
        ToIntFunction<String> longitud = s -> s.length();
        System.out.println("Longitud de 'Programacion': " + longitud.applyAsInt("Programacion"));
    }
}