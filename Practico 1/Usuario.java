
public class Usuario {

    private String nombre;
    private int edad;
    private String correo;
    private int telefono;

    // Constructor por defecto - sin parámetros
    public Usuario() {
        System.out.println("Usuario creado sin datos.");
    }

    // Constructor con nombre
    public Usuario(String nombre) {
        this.nombre = nombre;
        System.out.println("Usuario creado con nombre: " + nombre);
    }

    // Constructor con nombre y edad
    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        System.out.println("Usuario creado con nombre: " + nombre + " y edad: " + edad);
    }

    // Sobrecarga de métodos - solo correo
    public void actualizarPerfil(String correo) {
        this.correo = correo;
        System.out.println("Perfil actualizado. Correo: " + correo);
    }

    // Sobrecarga de métodos - correo y teléfono
    public void actualizarPerfil(String correo, int telefono) {
        this.correo = correo;
        this.telefono = telefono;
        System.out.println("Perfil actualizado. Correo: " + correo + " | Teléfono: " + telefono);
    }
} 