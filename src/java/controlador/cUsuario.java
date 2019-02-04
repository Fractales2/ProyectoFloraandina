/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import accesodatos.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import logica.usuarioLN;

/**
 *
 * @author dome9
 */
@ManagedBean
@ViewScoped
public class cUsuario implements Serializable {

    String nombre;
    String cedula;
    String contrasena;
    String correo;
    Boolean exito;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String ingresarUsuario() {

        Usuario usu = new Usuario();
        usu.setNombre_User(nombre);
        usu.setCedula_User(cedula);
        usu.setContrasena_User(contrasena);
        usu.setCorreo_User(correo);

        exito=usuarioLN.insertarUsuario(usu);
        if (exito==true) {  
            
             return "/View/UsuarioFRM?faces-redirect=true";
        } else {
            return "login?faces-redirect=true";
        }

    }
}
