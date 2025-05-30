package Control;

public class LoginControler {
    
//Usuario
String[][] credenciales = {
    {"paulamansilla", "mansilla"},
    {"carlosperez", "perez123"},
    {"lauragonzalez", "gonzalez456"},
    {"mariolopez", "lopez789"},
    {"anaruiz", "ruiz321"},
    {"josesanchez", "sanchez654"},
    {"elenafernandez", "fernandez987"}
   };
 

public  boolean validacionDatos (String EUsuario, String EContrasenna){

    boolean res = false;
    for (int i = 0; i < credenciales.length; i++){

        if (credenciales[i][0].equals(EUsuario) && credenciales[i][1].equals(EContrasenna)){
            res = true;
        }else {
            res = false;
        }
    }

     return res;
}
}

