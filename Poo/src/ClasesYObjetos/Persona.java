// ver que frutas es el método constructor

package ClasesYObjetos;

public class Persona {
    private final String nombre, carrera; // en forma de constantes
    int edad;
    double promedio;
    // el constructor
    public Persona(String nombre, String carrera, int edad, double promedio) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.edad = edad;
        this.promedio = promedio;
    }
    
    public void mostrarDatos() {
        System.out.println("El nombre es " + nombre);
        System.out.println("Estudia " + carrera);
        System.out.println("Tiene " + edad + " años");
        System.out.println("Con promedio de " + promedio);
    }
}