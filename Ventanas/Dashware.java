package Ventanas;
import javax.swing.JFrame;

public class Dashware extends JFrame {
    public Dashware() {
        JFrame Dashware = new JFrame();    
        Dashware.setTitle(""); 
        Dashware.setSize(800, 500); 
        Dashware.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        


        Dashware.setVisible(true);
}
    
        

    public JFrame getDashFrame(){
        return this;
    }
    
}
