
public class Reporte {

    // Método sin retorno - solo imprime, no devuelve nada
    public void generarEncabezado() {
        System.out.println("===== ENCABEZADO DEL REPORTE =====");
        System.out.println("Fecha: 30/04/2026");
    }

    // Método con retorno - devuelve una cadena de texto usando return
    public String obtenerCuerpo() {
        return "Este es el cuerpo del reporte con la información principal.";
    }

    // Varargs - acepta cualquier cantidad de argumentos, incluso ninguno
    public void agregarSecciones(String... secciones) {
        if (secciones.length == 0) {
            System.out.println("No se recibieron secciones.");
            return;
        }
        System.out.println("Secciones del reporte:");
        for (String seccion : secciones) {
            System.out.println("- " + seccion);
        }
    }
}