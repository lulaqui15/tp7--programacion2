import java.util.HashSet;

public class Ejercicio3_1 {
    public static void main(String[] args) {

        HashSet<Integer> conjunto = new HashSet<>();

        conjunto.add(10);
        conjunto.add(10);
        conjunto.add(10);

        //Verifica el tamaño 
        System.out.println("Tamaño del conjunto: " + conjunto.size());

        //Verificacion del nro
        if (conjunto.contains(10)) {
            System.out.println("El número 10 está en el conjunto");
        }

        //Eliminamos el nro
        conjunto.remove(10);

        System.out.println("Conjunto después de eliminar: " + conjunto);
    }
}