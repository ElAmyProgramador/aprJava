package Herencia;

public class Estudiante extends Persona {
    private int matriculaEstudiante;
    private float notaFinal;
    
    // el constructor de estudiante
    public Estudiante(String nombre, String apellido, int edad, int matriculaEstudiante, float notaFinal) {
        super(nombre, apellido, edad);
        this.matriculaEstudiante = matriculaEstudiante;
        this.notaFinal = notaFinal;
    }
    
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre() + 
                "\nApellido: " + getApellido() + 
                "\nEdad: " + getEdad() +
                "\nMatricula: " + matriculaEstudiante +
                "\nNota final: " + notaFinal);
    }
}
