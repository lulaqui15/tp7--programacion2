
import java.util.*;
import java.util.stream.Collectors;

public class Ejercicio4_4 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        //Eliminamos los duplicados usando Stream
        List<Integer> listaLimpia = numeros.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Lista sin duplicados: " + listaLimpia);

        //Lista de personas
        List<Persona> personas = Arrays.asList(
                new Persona(1, "Juan"), 
                new Persona(2, "Maria"),
                new Persona(3, "Carlos")
        );

        //Lo convertimos a mapa usando Stream
        Map<Integer, String> mapa = personas.stream()
                .collect(Collectors.toMap(
                        p -> p.getDni(),
                        p -> p.getNombre()
                ));

        System.out.println("Mapa de personas: " + mapa);
    }
}