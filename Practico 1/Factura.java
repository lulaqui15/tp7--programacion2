

public class Factura extends Documento implements Exportable, Auditable {
 
    // Ejercicio 3.2 - Sobrescritura del método abstracto
    @Override
    public void procesar() {
        System.out.println("Procesando Factura de forma estándar.");
    }
 
    public void procesar(boolean esUrgente) {
        if (esUrgente) {
            System.out.println("Procesando Factura de forma URGENTE.");
        } else {
            System.out.println("Procesando Factura sin urgencia.");
        }
    }
 
    @Override
    public void exportar() {
        System.out.println("Exportando Factura a archivo PDF.");
    }
 
    @Override
    public void registrarAuditoria() {
        System.out.println("Registrando auditoría de Factura.");
    }
}