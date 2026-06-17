import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio4_1 {

    public static void main(String[] args) {

        // El recurso se declara en los paréntesis del try
        // Java lo cierra automáticamente al terminar
        try (BufferedReader br = new BufferedReader(new FileReader("personas.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        }
    }
}