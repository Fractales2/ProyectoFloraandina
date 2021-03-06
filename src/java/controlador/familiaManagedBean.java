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
    private ArrayList<Familia> listafami;
    private Familia familiasel;
    private String nombreFamilia;
    private String nombreFamiliaAUX;
    private int idfamilia;
    
    public familiaManagedBean() {
        familianuevo = new Familia();
        cargarFamilia();
       
    }
     public final ArrayList<String> cargarFamilia() {
      ArrayList<String> lista = new ArrayList<>();  
        listafami= familaLN.obtenerFamilias();

        for (Familia s : listafami) {
            
            lista.add(s.getNombre_Familia());
        }
        return lista;
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

    public ArrayList<Familia> getListafami() {
        return listafami;
    }

    public void setListafami(ArrayList<Familia> listafami) {
        this.listafami = listafami;
    }

    public String getNombreFamiliaAUX() {
        return nombreFamiliaAUX;
    }

    public void setNombreFamiliaAUX(String nombreFamiliaAUX) {
        this.nombreFamiliaAUX = nombreFamiliaAUX;
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
    
    public int ingresar() {
        Familia objFam = new Familia();
        //lista.add(nombreSegmento);
        objFam.setNombre_Familia(nombreFamilia);
        Familia fam = familaLN.obtenerIdFamilia(objFam);
        nombreFamiliaAUX = fam.getId_Familia().toString();
        idfamilia = Integer.parseInt(nombreFamiliaAUX);
        return idfamilia;
    }
}
