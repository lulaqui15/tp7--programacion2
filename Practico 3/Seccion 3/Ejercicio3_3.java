
import java.util.Arrays;
import java.util.List;

public class Ejercicio3_3 {
    public static void main(String[] args) {

        //Lista
        List<List<String>> datos = Arrays.asList(
            Arrays.asList("Juan", "Maria"),
            Arrays.asList("Ana", "Pedro"),
            Arrays.asList("Luis", "Fernanda")
        );

        //Contar nombres con más de 4 letras 
        long cantidad = datos.stream() 
            .flatMap(lista -> lista.stream())
            .filter(nombre -> nombre.length() > 4)
            .count();

        System.out.println("Cantidad de nombres con más de 4 letras: " + cantidad);
    }
}