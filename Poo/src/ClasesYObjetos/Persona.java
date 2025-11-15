// ver que frutas es el método constructor

package ClasesYObjetos;

public class Persona {
    String nombre, carrera;
    int edad;
    double promedio;
    // el constructor
    public Persona(String _nombre, String _carrera, int _edad, double _promedio) {
        nombre = _nombre;
        carrera = _carrera;
        edad = _edad;
        promedio = _promedio;
    }
    
    public void mostrarDatos() {
        System.out.println("El nombre es " + nombre);
        System.out.println("Estudia " + carrera);
        System.out.println("Tiene " + edad + " años");
        System.out.println("Con promedio de " + promedio);
    }
}