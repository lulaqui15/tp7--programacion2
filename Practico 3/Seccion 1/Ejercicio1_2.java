
import java.util.List;
import java.util.ArrayList;

public class Ejercicio1_2 {
    public static void main(String[] args) {

        List<String> textos = new ArrayList<>();

        textos.add("Java");
        textos.add("Programacion");
        textos.add("Hola");
        textos.add("Stream");

        System.out.println("Lista original:");
        System.out.println(textos);

        //Orden por longitud
        textos.sort((a, b) -> a.length() - b.length());

        System.out.println("Ordenados por longitud:");
        System.out.println(textos);
    }
}