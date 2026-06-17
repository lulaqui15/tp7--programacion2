

public class TareaIdentidad implements Runnable {
 
    @Override
    public void run() {
        //Devuelve el hilo actual que se está ejecutando
        Thread hiloActual = Thread.currentThread();
 
        System.out.println("Hilo: " + hiloActual.getName()
                + " | Prioridad: " + hiloActual.getPriority()
                + " | ID: " + hiloActual.getId());
 
        for (int i = 1; i <= 5; i++) {
            System.out.println("  [" + hiloActual.getName() + "] -> número: " + i);
 
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Hilo [" + hiloActual.getName() + "] interrumpido.");
            }
        }
 
        System.out.println("Hilo [" + hiloActual.getName() + "] finalizado.");
    }
}