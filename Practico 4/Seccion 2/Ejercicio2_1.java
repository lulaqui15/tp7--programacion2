
public class Ejercicio2_1 {

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
        registrarUsuario("Ana", 25);  
        registrarUsuario("", 25);      // Falla por nombre en blanco
        registrarUsuario("Carlos", -5); // Falla por edad negativa
    }
}
