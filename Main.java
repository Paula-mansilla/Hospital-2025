import javax.swing.JFrame; //para crear ventanas
import javax.swing.JLabel; //para mostrar texto dentro de la ventana


public class Main {
    public static void main(String[] args) {
        //crear una ventana con JFrame
        JFrame miVentana = new JFrame();
        miVentana.setTitle("Hospital SCL");
        miVentana.setSize(1000,800);

          //Crear un texto
        JLabel texto = new JLabel();
        texto.setText("Hola Mundo");
        miVentana.add(texto);

        miVentana.setVisible(true);
     }
}