package ventana;

import java.awt.Color; // para poder ponerle color
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame {
    public Ventana() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Mi primer ventana");
        // this.setBounds(300, 80, 900, 600); // establecer coordenadas y tamaño
        this.setSize(900, 600);
        this.setLocationRelativeTo(null); // pantalla en el centro
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes() {
        JPanel panelo = new JPanel();
        panelo.setBackground(Color.GREEN); // para cansar la vista
        this.getContentPane().add(panelo);
    }
}