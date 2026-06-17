public class Ejercicio1_2 {

    public static void dividir() {
        try {
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Limpieza final");
        }
    }

    public static void main(String[] args) {
        dividir();
    }
}