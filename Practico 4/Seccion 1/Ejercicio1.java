public class Ejercicio1 {

    public static void main(String[] args) {

        try {
            int numero = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Mensaje del error: " + e.getMessage());
            System.out.println("Tipo de excepción: " + e.getClass().getName());
        }

    }
}