package ventana;

import javax.swing.JFrame;

public class Ventana extends JFrame {
    public Ventana() {
        this.setSize(900, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Mi primer ventana");
        this.setLocation(450, 80);
    }
}