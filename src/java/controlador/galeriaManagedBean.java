/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import accesodatos.Galeria;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import logica.galeriaLN;

/**
 *
 * @author ASUS
 */
@Named(value = "galeriaManagedBean")
@SessionScoped
public class galeriaManagedBean implements Serializable {

    /**
     * Creates a new instance of galeriaManagedBean
     */
    private ArrayList<Galeria> listagaleria;
    private Galeria galerianuevo;
    private Galeria galeriasel;
    public galeriaManagedBean() {
        galerianuevo = new Galeria();
    }

    public ArrayList<Galeria> getListagaleria() {
        return listagaleria;
    }

    public void setListagaleria(ArrayList<Galeria> listagaleria) {
        this.listagaleria = listagaleria;
    }

    public Galeria getGalerianuevo() {
        return galerianuevo;
    }

    public void setGalerianuevo(Galeria galerianuevo) {
        this.galerianuevo = galerianuevo;
    }

    public Galeria getGaleriasel() {
        return galeriasel;
    }

    public void setGaleriasel(Galeria galeriasel) {
        this.galeriasel = galeriasel;
    }
    public void ingresarGaleria() {
        try {
            if (galeriaLN.insertarGaleria(galerianuevo)) {
                FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO,
                        "Ingreso correcto ", "Los datos se guadaron correctamente");
                FacesContext.getCurrentInstance().addMessage("successInfo", facesMsg);
               }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
}
