
public class CuentaBancaria {
    private String nroCuenta;
    private Double saldo;

    public CuentaBancaria(String nroCuenta, Double saldo) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    // Getter del saldo - no hay setter para proteger modificación directa
    public Double getSaldo() {
        return saldo;
    }

    // El saldo solo puede modificarse a través de este método controlado
    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: el monto a depositar debe ser mayor a cero.");
            return;
        }
        saldo += monto;
        System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
    }
}