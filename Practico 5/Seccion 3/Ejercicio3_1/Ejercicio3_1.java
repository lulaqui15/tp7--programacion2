public class Ejercicio3_1 {
 
    public static void main(String[] args) throws InterruptedException {
 
        Contador contador = new Contador();
 
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
 
        hilo1.join();
        hilo2.join();
 
        System.out.println("Resultado esperado : " + (ITERACIONES * 2));
        System.out.println("Resultado real     : " + contador.getValor());
        System.out.println("Valores perdidos   : " + ((ITERACIONES * 2) - contador.getValor()));
    }
}