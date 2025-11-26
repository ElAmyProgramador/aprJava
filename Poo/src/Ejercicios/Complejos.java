package Ejercicios;

// basicamente implementar las operaciones del campo de los complejos
// me basaré en la forma de parejas ordenadas de la forma a + bi = (a, b) donde a y b están en los reales
public class Complejos {
    private double a, b;
    
    public static final Complejos CERO = new Complejos(0, 0);
    
    public Complejos(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    public double getReal() {
        return a;
    }
    
    public double getImaginaria() {
        return b;
    }
    
    public String mostrarComplejo() {
        return "(" + a + ", " + b + ")";
    }
}