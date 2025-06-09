package Paneles;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import Data.pacientes;

public class TablaBanner extends JScrollPane {

    public TablaBanner() {
        // Columnas de la tabla
        String[] columnas = { "ID", "Nombre", "Edad" };

        // Datos de la tabla
        Object[][] datos = new pacientes().getDatos();

        DefaultTableModel base = new DefaultTableModel(datos, columnas);
        JTable table = new JTable(base);
        this.setViewportView(table); 
        this.setBounds(0, 0, 400, 800);
    }
}
