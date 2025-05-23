package Vistas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginPanel {

private JPanel panelLogin;
   
    public LoginPanel (){
    

panelLogin = new JPanel();
panelLogin.setSize(500, 800);
panelLogin.setOpaque(true);
panelLogin.setBackground(Color.PINK);
panelLogin.setLayout(new GridBagLayout());

//administrador de diseño
GridBagConstraints gbc = new GridBagConstraints();
gbc.insets = new Insets(10 , 80 , 10, 80);
gbc.fill = GridBagConstraints.HORIZONTAL;
gbc.weightx = 1.0;

//titulo
JLabel titulo = new JLabel("Login");
titulo.setHorizontalAlignment(SwingConstants.CENTER);
titulo.setOpaque(true);
titulo.setBackground(Color.CYAN);
gbc.gridx = 0;
gbc.gridy = 0;
gbc.gridwidth = 0;
gbc.anchor = GridBagConstraints.CENTER;
panelLogin.add(titulo , gbc);


//Entrada correo
JTextField entradaCorreo = new JTextField("");
entradaCorreo.setSize(new Dimension(100,50));
gbc.gridx = 1;
gbc.gridy = 1;
panelLogin.add(entradaCorreo , gbc); 

//Entrada contraseña
JPasswordField entradacontraseña = new JPasswordField("");
entradacontraseña.setSize(new Dimension(100,50));
gbc.gridx = 1;
gbc.gridy = 2;
panelLogin.add(entradacontraseña , gbc); 

//botón
JButton btnIngresar = new JButton("ingrsar");
gbc.gridx = 1;
gbc.gridy = 3;
gbc.anchor = GridBagConstraints.EAST;
gbc.fill = GridBagConstraints.NONE;
panelLogin.add(btnIngresar ,gbc);
}

public JPanel getJPanel(){
    return panelLogin;
}
 }
