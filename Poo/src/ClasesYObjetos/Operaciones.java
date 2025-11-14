package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Operaciones {
    int res;
    
    public void sumar(int a, int b) {
        res = a + b;
    }
    
    public void resta(int a, int b) {
        res = a - b;
    }
    
    public void producto(int a, int b) {
        res = a * b;
    }
    
    public void division(int a, int b) {
        res = a / b;
    }
    
    public void mostrarRes() {
        System.out.println("El resultado es: " + res);
    }
}
