import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio5_1 {
    public static void main(String[] args) {

        ArrayList<Empleado> lista = new ArrayList<>();

        lista.add(new Empleado("Juan", 30));
        lista.add(new Empleado("Maria", 25));
        lista.add(new Empleado("Carlos", 35));

        System.out.println("Lista original:");
        System.out.println(lista);

        // Ordenar
        Collections.sort(lista);

        System.out.println("Lista ordenada por edad:");
        System.out.println(lista);
    }
}