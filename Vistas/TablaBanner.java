package Vistas;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class TablaBanner extends JScrollPane {

    public TablaBanner() {
        // Columnas de la tabla
        String[] columnas = { "ID", "Nombre", "Edad" };

        // Datos de la tabla
        Object[][] datos = {
            { 1, "Ana", 20 },
            { 2, "Luis", 22 },
            { 3, "María", 19 }
        };

        DefaultTableModel base = new DefaultTableModel(datos, columnas);
        JTable tabla = new JTable(base);
        this.setViewportView(tabla); // Muestra la tabla dentro del JScrollPane
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame ventana = new JFrame("Tabla Banner");
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setSize(400, 200);

            TablaBanner tablaBanner = new TablaBanner();
            ventana.add(tablaBanner); // Agregamos el JScrollPane (que contiene la tabla)

            ventana.setVisible(true);
        });
    }
}
