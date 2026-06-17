
public class Contador {
    private int valor = 0;
 
    public void incrementar() {
        valor = valor + 1; // <-- sección crítica, NO es atómica
    }
 
    public int getValor() {
        return valor;
    }
}
 