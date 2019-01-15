/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import logica.familaLN;
import accesodatos.Familia;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author ASUS
 */
@Named(value = "familiaManagedBean")
@SessionScoped
//@ViewScoped

public class familiaManagedBean implements Serializable{

    /**
     * Creates a new instance of familiaManagedBean
     */
    private ArrayList<Familia> listafamilia;
    private Familia familianuevo;
    private Familia familiasel;
    private String nombreFamilia;
    private int idfamilia;
    
    public familiaManagedBean() {
        familianuevo = new Familia();
        cargarFmilia();
    }
    //get and set
     public final void cargarFmilia() {
        listafamilia = familaLN.obtenerFamilias();
    }

    public String getNombreFamilia() {
        return nombreFamilia;
    }

    public void setNombreFamilia(String nombreFamilia) {
        this.nombreFamilia = nombreFamilia;
    }

    public int getIdfamilia() {
        return idfamilia;
    }

    public void setIdfamilia(int idfamilia) {
        this.idfamilia = idfamilia;
    }

    public ArrayList<Familia> getListafamilia() {
        return listafamilia;
    }

    public void setListafamilia(ArrayList<Familia> listafamilia) {
        this.listafamilia = listafamilia;
    }

    public Familia getFamilianuevo() {
        return familianuevo;
    }

    public void setFamilianuevo(Familia familianuevo) {
        this.familianuevo = familianuevo;
    }

    public Familia getFamiliasel() {
        return familiasel;
    }

    public void setFamiliasel(Familia familiasel) {
        this.familiasel = familiasel;
    }
    
    //funciones
    
    public void ingresarFamilia() {

        try {
            if (familaLN.insertarFamilia(familianuevo)) {
                FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO,
                        "Ingreso correcto ", "Los datos se guadaron correctamente");
                FacesContext.getCurrentInstance().addMessage("successInfo", facesMsg);
                
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
