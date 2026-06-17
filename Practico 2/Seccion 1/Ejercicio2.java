
import java.util.Arrays;


public class Ejercicio2 {
    public static void main(String[] args) {
        String elementos[] = {"Manzana", "Banana", "Naranja", "Pera", "Uva"};

        
        Arrays.sort(elementos);
        System.out.print("Lista ordenada:");
        for (int i=0;i<elementos.length;i++) {
            System.out.print(" "+elementos[i]);
        }
    
        int elementosEncontrado = Arrays.binarySearch(elementos, "Naranja");
        System.out.println("\nElemento encontrado: "+(elementosEncontrado+1));
    }
}
