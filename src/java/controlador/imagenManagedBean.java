/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import accesodatos.Imagen;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import logica.imagenLN;

/**
 *
 * @author ASUS
 */
@Named(value = "imagenManagedBean")
@SessionScoped
public class imagenManagedBean implements Serializable {

    /**
     * Creates a new instance of imagenManagedBean
     */
    private ArrayList<Imagen> listaimagen;
    private Imagen imagennuevo;
    private Imagen imagensel;
    public imagenManagedBean() {
        imagennuevo = new Imagen();
    }

    public ArrayList<Imagen> getListaimagen() {
        return listaimagen;
    }

    public void setListaimagen(ArrayList<Imagen> listaimagen) {
        this.listaimagen = listaimagen;
    }

    public Imagen getImagennuevo() {
        return imagennuevo;
    }

    public void setImagennuevo(Imagen imagennuevo) {
        this.imagennuevo = imagennuevo;
    }

    public Imagen getImagensel() {
        return imagensel;
    }

    public void setImagensel(Imagen imagensel) {
        this.imagensel = imagensel;
    }
    public void ingresarImagen() {
        try {
            if (imagenLN.insertarImagen(imagennuevo)) {
                FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO,
                        "Ingreso correcto ", "Los datos se guadaron correctamente");
                FacesContext.getCurrentInstance().addMessage("successInfo", facesMsg);
               }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
}
