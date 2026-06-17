public class TareaRunnable implements Runnable {
 
    private String nombre;
 
    public TareaRunnable(String nombre) {
        this.nombre = nombre;
    }
 
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hilo [" + nombre + "] - Numero: " + i);
 
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Hilo [" + nombre + "] interrumpido.");
            }
        }
        System.out.println("Hilo [" + nombre + "] finalizado.");
    }
}