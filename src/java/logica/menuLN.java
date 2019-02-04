/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import accesodatos.Menu;
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

public class menuLN {

    public static ArrayList<Menu> obtenerMenu() {
        ArrayList<Menu> listaMenu = new ArrayList<>();

        String sql = "SELECT \"codigo\", \"nombre\", \"tipo\", \"tipoUsuario\", \"codigo_submenu\", \"estado\", \"url\"\n"
                + "FROM public.\"MENU\";";

        try {
            ConjuntoResultado resultado = AccesoDatos.ejecutaQuery(sql);
            Menu menu;
            while (resultado.next()) {
                menu = new Menu();
                menu.setCodigo(resultado.getInt(0));
                menu.setNombre(resultado.getString(1));
                menu.setTipo(resultado.getString(2));
                menu.setTipoUsuario(resultado.getString(3));
                menu.setSubmenu(resultado.getInt(4));
                menu.setEstado(resultado.getBoolean(5));
                menu.setUrl(resultado.getString(6));
                listaMenu.add(menu);
            }
        } catch (Exception ex) {
            Logger.getLogger(familaLN.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        return listaMenu;
    }
}
