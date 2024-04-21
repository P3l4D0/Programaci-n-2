import javax.swing.*;
import java.awt.event.*;

public class PracticaJFrame extends JFrame {
    public PracticaJFrame() {
        // Configurar el título de la ventana
        setTitle("Mi Ventana");

        // Configurar el tamaño de la ventana
        setSize(300, 200);

        // Crear un botón
        JButton miBoton = new JButton("Mi Botón");

        // Crear un botón para cerrar la ventana
        JButton botonCerrar = new JButton("Cerrar");
        botonCerrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Añadir los botones al panel de contenido de la ventana
        getContentPane().add(miBoton, "North");
        getContentPane().add(botonCerrar, "South");

        // Hacer que la ventana sea visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new PracticaJFrame();
    }
}