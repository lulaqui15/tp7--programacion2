
import java.util.Scanner;

public class ClaseProgramacion {

    public static void enviarAImpresion(Exportable documentoExportable) {
        System.out.println("Enviando documento a impresión...");
        documentoExportable.exportar();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n\nWelcome!");
        entrada.close();

        // ── Sección 1 
        SistemaGestor sistema = new SistemaGestor();
        sistema.mostrarMaxConexion();

        // ── Sección 2
        Reporte reporte = new Reporte();
        reporte.generarEncabezado();
        System.out.println(reporte.obtenerCuerpo()); 
        reporte.agregarSecciones("Introducción", "Desarrollo", "Conclusión");
        reporte.agregarSecciones(); 

        Usuario u1 = new Usuario();
        Usuario u2 = new Usuario("Ana");
        Usuario u3 = new Usuario("Carlos", 25);

        u2.actualizarPerfil("ana@mail.com");
        u3.actualizarPerfil("carlos@mail.com", 123456789);

        // ── Sección 3 
        Documento doc1 = new Factura();
        Documento doc2 = new Recibo();

        doc1.procesar(); 
        doc2.procesar(); 

        Factura factura = new Factura();
        factura.procesar(true); 
        factura.procesar(false); 

        // ── Sección 4 

        factura.exportar();
        factura.registrarAuditoria();

        enviarAImpresion(factura);
    }
}