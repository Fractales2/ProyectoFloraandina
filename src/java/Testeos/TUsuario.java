/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testeos;

import accesodatos.Usuario;
import java.util.List;
import logica.usuarioLN;

/**
 *
 * @author dome9
 */
public class TUsuario {

    public static void main(String[] args) {
        Usuario usu = new Usuario();
        usu.setCedula_User("www");
        usu.setContrasena_User("www");
        Usuario usua = usuarioLN.obtenerUsuario(usu);
        System.out.println(usua.getNombre_User());

    }
}
