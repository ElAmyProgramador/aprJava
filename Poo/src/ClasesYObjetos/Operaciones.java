package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Operaciones {
    int a, b, res;
    public void leerNums() {
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de a: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor de b: "));
    }
    
    public void sumar() {
        res = a + b;
    }
    
    public void resta() {
        res = a - b;
    }
    
    public void producto() {
        res = a * b;
    }
    
    public void division() {
        res = a / b;
    }
    
    public void mostrarRes() {
        System.out.println("El resultado es: " + res);
    }
    
    public static void main(String[] args) {
        Operaciones op = new Operaciones();
        op.leerNums();
        op.sumar();
        op.mostrarRes();
    }
}
