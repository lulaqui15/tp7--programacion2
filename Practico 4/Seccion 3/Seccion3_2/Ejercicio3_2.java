
public class Ejercicio3_2 {

    static class Producto {
        private String nombre;
        private double precio;

        public Producto(String nombre, double precio) {
            if (precio <= 0) {
                throw new ProductoInvalidoException("El precio no puede ser menor o igual a cero.");
            }
            this.nombre = nombre;
            this.precio = precio;
            System.out.println("Producto creado: " + nombre + ", precio: " + precio);
        }
    }

    public static void main(String[] args) {

        // Caso exitoso
        Producto p1 = new Producto("Laptop", 1500.0);

        // Caso sin try/catch - el programa falla y lo demuestra
        Producto p2 = new Producto("Mouse", -10.0);
    }
}