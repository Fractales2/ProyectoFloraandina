/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import accesodatos.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import logica.usuarioLN;
import org.primefaces.context.RequestContext;

/**
 *
 * @author dome9
 */
@ManagedBean
@ViewScoped
public class CLogin implements Serializable {

    private String strCedula;
    private String strClave;

    public String login() {
        Usuario usu = new Usuario();
        usu.setCedula_User(strCedula);
        usu.setContrasena_User(strClave);
        usu = usuarioLN.obtenerUsuario(usu);
       
        
        if (usu.getId_User() != null) {
            //Almacenar en la sesion de JSF
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", usu);
            
            return "Templates/IndexPF?faces-redirect=true";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Credenciales Incorrectas"));
            return "login?faces-redirect=true";
            //System.out.println("Error al iniciar");

        }

    }

    public String getStrCedula() {
        return strCedula;
    }

    public void setStrCedula(String strCedula) {
        this.strCedula = strCedula;
    }

    public String getStrClave() {
        return strClave;
    }

    public void setStrClave(String strClave) {
        this.strClave = strClave;
    }

}
