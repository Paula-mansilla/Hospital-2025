package Ventanas;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import Paneles.MenuLateralPanel;
import Paneles.TablaBanner; 

public class Dashware extends JFrame {
    
    public Dashware(){
        
        // Ventana
        this.setTitle("Dashware");
        this.setSize(1600, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        this.add(new MenuLateralPanel().getPanel(), BorderLayout.WEST);
        TablaBanner tablaBanner = new TablaBanner();
        add(tablaBanner);
       


        this.setVisible(true);
    }

}