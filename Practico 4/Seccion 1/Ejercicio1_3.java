
public class Ejercicio1_3 {

    public static void calcular(String input) {
        try {
            int numero = Integer.parseInt(input);
            int resultado = 100 / numero;
            System.out.println("Resultado: " + resultado);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        calcular("abc");  // Provoca NumberFormatException
        calcular("0");    // Provoca ArithmeticException
        calcular("5");    
    }
}