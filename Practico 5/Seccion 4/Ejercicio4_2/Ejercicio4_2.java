public class Ejercicio4_2 {
 
    // Cambiá entre "join" e "interrupt" para probar cada caso
    private static final String MODO = "join";
 
    public static void main(String[] args) throws InterruptedException {
 
        Thread hiloSecundario = new Thread(new TareaLarga());
 
        System.out.println("[Main] Iniciando hilo secundario en MODO: " + MODO);
        hiloSecundario.start();
 
        if (MODO.equals("join")) {
 
            System.out.println("[Main] Esperando con join() a que el hilo secundario termine...");
            hiloSecundario.join(); // el main se bloquea aquí hasta que hiloSecundario termina
            System.out.println("[Main] El hilo secundario terminó. El main continúa.");
 
        } else if (MODO.equals("interrupt")) {
 
            // El main espera 2 segundos y luego interrumpe al hilo secundario
            Thread.sleep(2500);
            System.out.println("[Main] Enviando interrupción al hilo secundario...");
            hiloSecundario.interrupt();
            System.out.println("[Main] Interrupción enviada. El main continúa sin esperar.");
        }
 
        System.out.println("[Main] Fin del programa.");
    }
}