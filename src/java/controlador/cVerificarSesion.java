/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import accesodatos.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author dome9
 */
@Named
@ViewScoped
public class cVerificarSesion implements Serializable {

    public void verificarSesion() {
        try {
            FacesContext context = FacesContext.getCurrentInstance();
            Usuario usu = (Usuario) context.getExternalContext().getSessionMap().get("usuario");
            
            if (usu == null) {
                context.getExternalContext().redirect("./../login.xhtml");
            }
        } catch (Exception e) {
            //log para guardar registro de error 
        }
    }
}
