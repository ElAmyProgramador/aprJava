// para hacer más leible el ejericicio de los complejos

package Ejercicios;

public class PrincipalComp {
    public static Complejos suma(Complejos z, Complejos w) {
    double sumaRe, sumaIm;
    sumaRe = z.getReal() + w.getReal();
    sumaIm = z.getImaginaria() + w.getImaginaria();
    Complejos suma = new Complejos(sumaRe, sumaIm);
    return suma;
    }
    
    public static Complejos producto(Complejos z, Complejos w) {
        double a, b;
        a = (z.getReal() * w.getReal()) - (z.getImaginaria() * w.getImaginaria());
        b = (z.getReal() * w.getImaginaria()) + (z.getImaginaria() * w.getReal());
        Complejos res = new Complejos(a, b);
        return res;
    }
    
    public static Complejos producto(int a, Complejos z) {
        double x, y;
        x = a * z.getReal();
        y = a * z.getImaginaria();
        Complejos res = new Complejos(x, y);
        return res;
    }
    
    public static String compararComplejos(Complejos z, Complejos w) {
        String res;
        if (z.getReal() == w.getReal() && w.getImaginaria() == w.getImaginaria()) {
            res = "Son iguales";
        } else {
            res = "No son iguales";
        }
        return res;
    }
    
    public static void main(String[] args) {
        Complejos z = new Complejos(3, 4);
        Complejos w = new Complejos(2, 3);
        System.out.println("La suma de " + z.mostrarComplejo() + " + " + w.mostrarComplejo() + " es: " + suma(z, w).mostrarComplejo());
        System.out.println("El producto de " + z.mostrarComplejo() + " * " + w.mostrarComplejo() + " es: " + producto(z, w).mostrarComplejo());
        System.out.println(compararComplejos(z, w));
        int x = 5;
        System.out.println("El producto de " + x + " * " + z.mostrarComplejo() + " es: " + producto(x, z).mostrarComplejo());
    }
}