/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import accesodatos.Usuario;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import logica.usuarioLN;

/**
 *
 * @author ASUS
 */
@Named(value = "usuarioManagedBean")
@SessionScoped
public class usuarioManagedBean implements Serializable {

    /**
     * Creates a new instance of usuarioManagedBean
     */
    private ArrayList<Usuario> listausuario;
    private Usuario usuarionuevo;
    private Usuario usuariosel;
    public usuarioManagedBean() {
        usuarionuevo = new Usuario();
    }

    public ArrayList<Usuario> getListausuario() {
        return listausuario;
    }

    public void setListausuario(ArrayList<Usuario> listausuario) {
        this.listausuario = listausuario;
    }

    public Usuario getUsuarionuevo() {
        return usuarionuevo;
    }

    public void setUsuarionuevo(Usuario usuarionuevo) {
        this.usuarionuevo = usuarionuevo;
    }

    public Usuario getUsuariosel() {
        return usuariosel;
    }

    public void setUsuariosel(Usuario usuariosel) {
        this.usuariosel = usuariosel;
    }
     public void ingresarUsuario() {
        try {
            if (usuarioLN.insertarUsuario(usuarionuevo)) {
                FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO,
                        "Ingreso correcto ", "Los datos se guadaron correctamente");
                FacesContext.getCurrentInstance().addMessage("successInfo", facesMsg);
               }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
}
