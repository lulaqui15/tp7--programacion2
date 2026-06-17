import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Tarea 1");
        lista.add("Tarea 2");
        lista.add("Programacion");

        lista.set(1, "Actualizado");
        lista.get(0);
        System.out.println("Valor obtenido: " + lista.get(0));

        System.out.println("Lista: " +lista);
        lista.remove(2);

        
        for (String tarea : lista) {
            System.out.println(tarea);
        }
        
    }
}