/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import accesodatos.Analisis;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import logica.analisiLN;

/**
 *
 * @author ASUS
 */
@Named(value = "analisisManagedBean")
@SessionScoped
public class analisisManagedBean implements Serializable {

    /**
     * Creates a new instance of analisisManagedBean
     */
    private ArrayList<Analisis> listaanalisis;
    private Analisis analisisnuevo;
    private Analisis analisissel;
    
    public analisisManagedBean() {
    analisisnuevo = new Analisis();
    }

    public ArrayList<Analisis> getListaanalisis() {
        return listaanalisis;
    }

    public void setListaanalisis(ArrayList<Analisis> listaanalisis) {
        this.listaanalisis = listaanalisis;
    }

    public Analisis getAnalisisnuevo() {
        return analisisnuevo;
    }

    public void setAnalisisnuevo(Analisis analisisnuevo) {
        this.analisisnuevo = analisisnuevo;
    }

    public Analisis getAnalisissel() {
        return analisissel;
    }

    public void setAnalisissel(Analisis analisissel) {
        this.analisissel = analisissel;
    }
     public void ingresarAnalisis() {
        try {
            if (analisiLN.insertarAnalisis(analisisnuevo)) {
                FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO,
                        "Ingreso correcto ", "Los datos se guadaron correctamente");
                FacesContext.getCurrentInstance().addMessage("successInfo", facesMsg);
               }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
}
