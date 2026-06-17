public class TareaLarga implements Runnable {
 
    @Override
    public void run() {
        System.out.println("[Hilo secundario] Iniciando tarea larga...");
 
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println("[Hilo secundario] Trabajando... paso " + i + " de 5");
                Thread.sleep(1000); // simula 1 segundo de trabajo por paso
 
            } catch (InterruptedException e) {
                // Cuando interrupt() es llamado sobre este hilo mientras duerme,
                // se lanza esta excepción y el hilo puede terminar ordenadamente
                System.out.println("[Hilo secundario] ¡Interrumpido en el paso " + i + "! Terminando...");
                return; // sale del run() limpiamente
            }
        }
 
        System.out.println("[Hilo secundario] Tarea larga finalizada correctamente.");
    }
}