

public class SistemaGestor {  
   
    public static final int MAX_CONEXIONES = 10; //Constante
    //Una vez asignado en la declaración, el compilador impide cualquier reasignación.

     /* 
        Bloque de configuración de constantes del sistema.
        Estos valores definen los límites operativos y no pueden modificarse
        una vez que el programa está en ejecución.
     */
  
     public void mostrarMaxConexion(){
        System.out.println("La cantidad maxima de conexiones es: "+MAX_CONEXIONES);
        System.out.println("\n");
     }
}
