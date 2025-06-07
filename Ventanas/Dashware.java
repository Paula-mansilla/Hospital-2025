package Ventanas;

import javax.swing.JFrame;
import Vistas.TablaBanner; 

public class Dashware extends JFrame {
    
    public Dashware(){
        
        // Ventana
        this.setTitle("Dashware");
        this.setSize(1000, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        // Crear y agregar la tabla
        TablaBanner tabla = new TablaBanner();
        tabla.setBounds(0, 0, 1000, 800); 
        this.add(tabla); 

        this.setVisible(true);
    }
    public JFrame getDasFrame(){
        return this;
    }
}