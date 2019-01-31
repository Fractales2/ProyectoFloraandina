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
        lstpar.add(new Parametro(1, usuario.getId_User()));
        lstpar.add(new Parametro(2, usuario.getContrasena_User()));
        lstpar.add(new Parametro(3, usuario.getCedula_User()));
        lstpar.add(new Parametro(4, usuario.getNombre_User()));
        lstpar.add(new Parametro(5, usuario.getCorreo_User()));
        lstpar.add(new Parametro(6, usuario.getTipo_User()));
        lstpar.add(new Parametro(7, usuario.getEstado_User()));
        String sql = "INSERT INTO public.\"USUARIO\"(\n"
                + "	\"Id_User\", \"Contrasena_User\", \"Cedula_User\", \"Nombre_User\", \"Correo_User\", \"Tipo_User\", \"Estado_User\")\n"
                + "	VALUES (?, ?, ?, ?, ?, ?, ?);";
        try {
            resp = AccesoDatos.ejecutaComando1(sql, lstpar);
        } catch (Exception ex) {
            Logger.getLogger(usuarioLN.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        return resp;
    }
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public static ArrayList<Usuario> obtenerUsuario(Usuario usuario) {
        ArrayList<Usuario> listaUsuario = new ArrayList<>();

        String sql = "SELECT \"Id_User\", \"Contrasena_User\", \"Cedula_User\", \"Nombre_User\", \"Correo_User\", \"Tipo_User\", \"Estado_User\"\n"
                + "FROM public.\"USUARIO\"\n"
                + "WHERE \"Cedula_User\"='060378497-6' AND \"Contrasena_User\"='Riobamba2018';";

        try {
            ConjuntoResultado resultado = AccesoDatos.ejecutaQuery(sql);
            Usuario usua;
            while (resultado.next()) {
                usua = new Usuario();
                usua.setId_User(resultado.getInt(0));
                usua.setContrasena_User(resultado.getString(1));
                usua.setCedula_User(resultado.getString(2));
                usua.setNombre_User(resultado.getString(3));
                usua.setCorreo_User(resultado.getString(4));
                usua.setTipo_User(resultado.getString(5));
                usua.setEstado_User(resultado.getString(6));
                listaUsuario.add(usua);
            }
        } catch (Exception ex) {
            Logger.getLogger(familaLN.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        return listaUsuario;
    }
}
