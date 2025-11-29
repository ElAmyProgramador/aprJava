package ventana;

import javax.swing.JFrame;

public class Ventana extends JFrame {
    public Ventana() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Mi primer ventana");
        // this.setBounds(300, 80, 900, 600); // establecer coordenadas y tamaño
        this.setSize(900, 600);
        this.setLocationRelativeTo(null); // pantalla en el centro
    }
}