/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import accesodatos.Usuario;
import conexionBD.AccesoDatos;
import conexionBD.ConjuntoResultado;
import conexionBD.Parametro;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author ASUS
 */
public class usuarioLN {

    public static boolean insertarUsuario(Usuario usuario) {

        boolean resp = false;
        ArrayList<Parametro> lstpar = new ArrayList<>();

        lstpar.add(new Parametro(1, usuario.getContrasena_User()));
        lstpar.add(new Parametro(2, usuario.getCedula_User()));
        lstpar.add(new Parametro(3, usuario.getNombre_User()));
        lstpar.add(new Parametro(4, usuario.getCorreo_User()));
        lstpar.add(new Parametro(5, "usuario"));
        lstpar.add(new Parametro(6, "activo"));
        String sql = "INSERT INTO public.\"USUARIO\"(\n"
                + "     \"Contrasena_User\", \"Cedula_User\", \"Nombre_User\", \"Correo_User\", \"Tipo_User\", \"Estado_User\")\n"
                + "	VALUES (?, ?, ?, ?, ?, ?);";
        try {
            resp = AccesoDatos.ejecutaComando1(sql, lstpar);
        } catch (Exception ex) {
            Logger.getLogger(usuarioLN.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        return resp;
    }

    public static Usuario obtenerUsuario(Usuario usuario) {

        Usuario usua  = new Usuario();
        String sql = "SELECT \"Id_User\", \"Contrasena_User\", \"Cedula_User\", \"Nombre_User\", \"Correo_User\", \"Tipo_User\", \"Estado_User\"\n"
                + "FROM public.\"USUARIO\"\n"
                + "WHERE \"Cedula_User\"='" + usuario.getCedula_User() + "' AND \"Contrasena_User\"='" + usuario.getContrasena_User() + "';";

        try {
            ConjuntoResultado resultado = AccesoDatos.ejecutaQuery(sql);

            while (resultado.next()) {

                usua.setId_User(resultado.getInt(0));
                usua.setContrasena_User(resultado.getString(1));
                usua.setCedula_User(resultado.getString(2));
                usua.setNombre_User(resultado.getString(3));
                usua.setCorreo_User(resultado.getString(4));
                usua.setTipo_User(resultado.getString(5));
                usua.setEstado_User(resultado.getString(6));

            }
        } catch (Exception ex) {
            Logger.getLogger(familaLN.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        return usua;
    }
}
