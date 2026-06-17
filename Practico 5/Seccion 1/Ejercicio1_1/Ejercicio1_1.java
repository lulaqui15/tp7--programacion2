
public class Ejercicio1_1 {
    public static void main(String[] args) {

        //Se crean tres instancias de TareaHilo
        TareaHilo hilo1 = new TareaHilo("A");
        TareaHilo hilo2 = new TareaHilo("B");
        TareaHilo hilo3 = new TareaHilo("C");

        hilo1.start();
        hilo2.start();
        hilo3.start();
 
        System.out.println("Hilos Iniciados...");
    }
}