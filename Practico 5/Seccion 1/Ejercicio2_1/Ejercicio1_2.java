public class Ejercicio1_2 {
 
    public static void main(String[] args) {
 
        // Se crean las tareas (Runnable)
        TareaRunnable tarea1 = new TareaRunnable("A"); 
        TareaRunnable tarea2 = new TareaRunnable("B"); 
        TareaRunnable tarea3 = new TareaRunnable("C"); 
 
        // Se crean los hilos pasando la tarea como argumento
        // El hilo sabe qué ejecutar gracias al objeto Runnable
        Thread hilo1 = new Thread(tarea1);
        Thread hilo2 = new Thread(tarea2);
        Thread hilo3 = new Thread(tarea3);
 
        // Se inician los hilos concurrentemente
        hilo1.start();
        hilo2.start();
        hilo3.start();
 
        System.out.println("Hilos Iniciados...");
    }
}