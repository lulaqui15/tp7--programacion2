
public class Contador {
 
    private int valor = 0;
 
    // synchronized protege toda la ejecución del método
    public synchronized void incrementar() {
        valor = valor + 1;
    }
 
    public int getValor() {
        return valor;
    }
}