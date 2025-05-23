
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

import Vistas.LoginPanel;


public class Main {
    public static void main(String[] args) {
     //crear una ventana con JFrame
      JFrame miVentana = new JFrame(); // crea un objeto
      miVentana.setTitle("Hospital SCL");
      miVentana.setSize(1000,800);
      miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      miVentana.setLayout(new BorderLayout());
      
      
      // Panel Banner
      JPanel panelBanner = new JPanel();
      panelBanner.setPreferredSize(new Dimension(500,000));
      panelBanner.setOpaque(true);
      panelBanner.setBackground(Color.RED);
      miVentana.add(panelBanner);
      miVentana.add(panelBanner, BorderLayout.WEST);

       // Panel Login         //metodo costructor
      LoginPanel panelLogin = new LoginPanel(); // objeto
      miVentana.add(panelLogin.getJPanel(), BorderLayout.CENTER);



        miVentana.setVisible(true);
     }
}