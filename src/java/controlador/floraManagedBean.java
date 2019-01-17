/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import accesodatos.Flora;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import logica.floraLN;
import controlador.familiaManagedBean;
import javax.inject.Named;

/**
 *
 * @author ASUS
 */
@Named(value = "floraManagedBean")
@SessionScoped



public class floraManagedBean implements Serializable {

    /**
     * Creates a new instance of floraManagedBean
     */
    private ArrayList<Flora> listafamilia;
    private Flora floranuevo;
    private Flora florasel;
    
    public floraManagedBean() {
        floranuevo = new Flora();
      
    }

    public ArrayList<Flora> getListafamilia() {
        return listafamilia;
    }

    public void setListafamilia(ArrayList<Flora> listafamilia) {
        this.listafamilia = listafamilia;
    }

    public Flora getFloranuevo() {
        return floranuevo;
    }

    public void setFloranuevo(Flora floranuevo) {
        this.floranuevo = floranuevo;
    }

    public Flora getFlorasel() {
        return florasel;
    }

    public void setFlorasel(Flora florasel) {
        this.florasel = florasel;
    }
          
    //funciones
    public void ingresarFlora() {
        try {
            if (floraLN.insertarFlora(floranuevo)) {
                FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO,
                        "Ingreso correcto ", "Los datos se guadaron correctamente");
                FacesContext.getCurrentInstance().addMessage("successInfo", facesMsg);
                
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
