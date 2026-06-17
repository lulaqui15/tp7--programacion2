
public class Contador {
 
    private int valor = 0;
 
    public void incrementar() {
 
        synchronized (this) {
            // Solo un hilo a la vez puede estar aquí
            valor = valor + 1;
        }
    }
 
    public int getValor() {
        return valor;
    }
}