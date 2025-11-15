// en netbeans solo te vas a file > project properties > run > select binary
package ClasesYObjetos;

import javax.swing.JOptionPane;

public class mainOps {
    public static void main(String[] args) {
        int n1, n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuánto vale el número 1?"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuánto vale el número 2?"));
        Operaciones op = new Operaciones();
        int res = op.sumar(n1, n2);
        op.mostrarRes(res);
    }
}
