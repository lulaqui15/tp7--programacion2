
public class Ejercicio4_1 {
 
    public static void main(String[] args) {
 
        Thread hilo1 = new Thread(new TareaIdentidad());
        Thread hilo2 = new Thread(new TareaIdentidad());
        Thread hilo3 = new Thread(new TareaIdentidad());
 

        hilo1.setName("Hilo-BAJA");
        hilo2.setName("Hilo-NORMAL");
        hilo3.setName("Hilo-ALTA");
 
        //Asignamos prioridades, antes de iniciar los hilos
        hilo1.setPriority(Thread.MIN_PRIORITY); 
        hilo2.setPriority(Thread.NORM_PRIORITY);
        hilo3.setPriority(Thread.MAX_PRIORITY);
 
        System.out.println("Hilos con distintas prioridades...\n");
 
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}