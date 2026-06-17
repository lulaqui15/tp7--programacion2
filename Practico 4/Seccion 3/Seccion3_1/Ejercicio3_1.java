
public class Ejercicio3_1 {

    static double saldo = 100.0;

    // throws obliga a quien llame al método a manejar la excepción
    public static void retirar(double monto) throws SaldoInsuficienteException {
        if (monto > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente. Saldo actual: " + saldo);
        }
        saldo -= monto;
        System.out.println("Retiro exitoso. Saldo restante: " + saldo);
    }

    public static void main(String[] args) {
        try {
            retirar(50.0);   // Funciona correctamente
            retirar(200.0);  // Falla por saldo insuficiente
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}