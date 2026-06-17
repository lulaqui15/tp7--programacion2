
public class Ejercicio2_1 {

    public static void main(String[] args) throws InterruptedException {

        // Una sola instancia de Contador compartida por ambos hilos
        Contador contador = new Contador();

        // Cada hilo incrementa 100.000 veces → esperamos 200.000 al final
        int ITERACIONES = 100_000;

        Thread hilo1 = new Thread(() -> {
            for (int i = 0; i < ITERACIONES; i++) {
                contador.incrementar();
            }
        });

        Thread hilo2 = new Thread(() -> {
            for (int i = 0; i < ITERACIONES; i++) {
                contador.incrementar();
            }
        });

        hilo1.start();
        hilo2.start();

        // join() hace que el main espere a que ambos hilos terminen
        // antes de imprimir el resultado
        hilo1.join();
        hilo2.join();

        System.out.println("Resultado esperado : " + (ITERACIONES * 2));
        System.out.println("Resultado real     : " + contador.getValor());
        System.out.println("Valores perdidos   : " + ((ITERACIONES * 2) - contador.getValor()));
    }
}