public class Empleado implements Comparable<Empleado> {

    private String nombre;
    private int edad;

    // Constructor
    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Método para mostrar el objeto
    @Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }

    // Orden natural por edad
    @Override
    public int compareTo(Empleado otro) {
        return this.edad - otro.edad;
    }
}