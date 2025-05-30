package Vistas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import Control.LoginControler;
import Ventanas.Dashware;

public class LoginPanel {

private JPanel panelLogin;
   
    public LoginPanel(){
    

panelLogin = new JPanel();
panelLogin.setSize(500, 800);
panelLogin.setOpaque(true);
panelLogin.setBackground(Color.WHITE);
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
titulo.setBackground(Color.WHITE);
gbc.gridx = 0;
gbc.gridy = 0;
gbc.gridwidth = 0;
gbc.anchor = GridBagConstraints.CENTER;
panelLogin.add(titulo , gbc);


//Entrada correo
JTextField entradaCorreo = new JTextField("Usuario");
entradaCorreo.setSize(new Dimension(100,50));
gbc.gridx = 1;
gbc.gridy = 1;
panelLogin.add(entradaCorreo , gbc); 

//Entrada contraseña
JPasswordField entradacontraseña = new JPasswordField("Contraseña");
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

//Usuario
String usuario [] = { "paulamansilla"};
String contrasenna [] = {"mansilla"};

//boton login

btnIngresar.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e) {

String entradaUsuario = entradaCorreo.getText();
String entradaContrasenna = entradacontraseña.getText();
        
if(new LoginControler().validacionDatos(entradaUsuario, entradaContrasenna)){
    
new Dashware();
JFrame ventanaPadre = (JFrame) SwingUtilities.getWindowAncestor(panelLogin);
ventanaPadre.dispose();
}
    }

});


}

public JPanel getJPanel(){
    return panelLogin;
}
 }
