
import java.util.HashMap;

public class Ejercicio4_1 {
    public static void main(String[] args) {

        HashMap<Integer, String> usuarios = new HashMap<>();

        //Agregamos elementos 
        usuarios.put(1, "Juan");
        usuarios.put(2, "Maria");
        usuarios.put(3, "Carlos");

        System.out.println("Mapa inicial: " + usuarios);

        //Recuperamos el valor
        String nombre = usuarios.get(2);
        System.out.println("Usuario con ID 2: " + nombre);

        //Actualizamos
        usuarios.replace(3, "Pedro");
        System.out.println("Mapa actualizado: " + usuarios);

        //Eliminamos
        usuarios.remove(1);
        System.out.println("Mapa final: " + usuarios);
    }
}