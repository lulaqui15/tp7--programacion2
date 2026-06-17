
public class Ejercicio2_2 {

    public static void registrarUsuario(String nombre, int edad) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o estar en blanco.");
        }
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
        System.out.println("Usuario registrado: " + nombre + ", edad: " + edad);
    }

    public static void main(String[] args) {

        // Caso exitoso
        try {
            registrarUsuario("Ana", 25);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Caso con edad negativa
        try {
            registrarUsuario("Carlos", -5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Caso con nombre en blanco
        try {
            registrarUsuario("", 25);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}