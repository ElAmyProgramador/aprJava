package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Operaciones {
    public int sumar(int a, int b) {
        return a + b;
    }
    
    public int resta(int a, int b) {
        return a - b;
    }
    
    public int producto(int a, int b) {
        return a * b;
    }
    
    public double division(int a, int b) {
        return a / b;
    }
    
    public void mostrarRes(double res) {
        System.out.println("El resultado es: " + res);
    }
}
