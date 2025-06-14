package Paneles;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuLateralPanel extends JPanel {
    
    // Botones agregados
    private JButton btnPacientes;
    private JButton btnHistorial;
    private JButton btnHabitaciones;
    private JButton btnDoctores;
    private JButton btnCirujanos;
    private JButton btnServiciosLimpieza;
    
    public MenuLateralPanel() {
        this.setPreferredSize(new Dimension(400, 1000));
        this.setOpaque(true);
        this.setBackground(Color.PINK);

        // --- AGREGADO: Creación de botones ---
        btnPacientes = new JButton("Pacientes");
        btnPacientes.setBounds(20, 50, 150, 40); // (x, y, ancho, alto)
        
        btnHistorial = new JButton("Historial");
        btnHistorial.setBounds(180, 50, 150, 40); // Posición debajo del primero

        btnHabitaciones = new JButton("Habitaciones");
        btnHabitaciones.setBounds(20, 110, 150, 40);

        btnDoctores = new JButton("Doctores");
        btnDoctores.setBounds(180, 110, 150, 40);

        btnCirujanos = new JButton("Cirujanos");
        btnCirujanos.setBounds(20, 170, 150, 40);

        btnServiciosLimpieza = new JButton("Servicios de Limpieza");
        btnServiciosLimpieza.setBounds(180, 170, 150, 40);

        // Agregar botones al panel
        this.setLayout(null); // Layout nulo para usar setBounds
        this.add(btnPacientes);
        this.add(btnHistorial);
        this.add(btnHabitaciones);
        this.add(btnDoctores);
        this.add(btnCirujanos);
        this.add(btnServiciosLimpieza);
        // --- FIN AGREGADO ---
    }
    
    public JPanel getPanel() {
        return this;
    }
}
    
