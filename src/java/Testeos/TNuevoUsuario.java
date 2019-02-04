package Testeos;

import accesodatos.Usuario;
import java.util.List;
import logica.usuarioLN;

/**
 *
 * @author dome9
 */
public class TNuevoUsuario {

    public static void main(String[] args) {
        Usuario usu = new Usuario();
        
        usu.setNombre_User("Guadalupe");
        usu.setContrasena_User("Riobamba2018");
        usu.setCedula_User("060378497-6");
        usu.setCorreo_User("dome.95@hotmail.es");
        
        Boolean lista = usuarioLN.insertarUsuario(usu);
       
            System.out.println(lista);
        
    }
}


