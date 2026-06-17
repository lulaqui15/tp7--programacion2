import java.util.TreeMap;

public class Ejercicio4_2 {
    public static void main(String[] args) {

        TreeMap<Integer, String> usuarios = new TreeMap<>();

        //Agregamos elementos
        usuarios.put(3, "Carlos");
        usuarios.put(1, "Juan");
        usuarios.put(2, "Maria");

        System.out.println("Mapa ordenado automáticamente: " + usuarios);

        //Recorrer las claves
        System.out.println("Recorriendo claves:");

        for (Integer clave : usuarios.keySet()) {
            System.out.println("Clave: " + clave + " -> Valor: " + usuarios.get(clave));
        }
    }
}