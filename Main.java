import java.awt.BorderLayout;

import javax.swing.*;

import Paneles.LoginPanel;
import Paneles.bannerPanel;

public class Main {
    public static void main(String[] args) {

        // Ventana
        JFrame miVentana = new JFrame();    // Crea una nueva ventana vacía
        miVentana.setTitle("Hospital SCL"); // Título que aparece en la parte superior
        miVentana.setSize(1000, 800);       // Establece el tamaño de la ventana (ancho x alto)
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLayout(new BorderLayout());
        miVentana.setLocationRelativeTo (null);
        
        
        // Panel Banner
        LoginPanel loginPanel = new LoginPanel();
        miVentana.add(loginPanel.getJPanel(), BorderLayout.CENTER);

        // Panel Login
       bannerPanel bannerPanel = new bannerPanel();
       miVentana.add(bannerPanel.getBanner(), BorderLayout.WEST);

        miVentana.setVisible(true);         // Muestra la ventana en pantalla
    }
}


