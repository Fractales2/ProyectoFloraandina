/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import accesodatos.Archivo;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import logica.archivoLN;

/**
 *
 * @author ASUS
 */
@Named(value = "archivoManagedBean")
@SessionScoped
public class archivoManagedBean implements Serializable {

    /**
     * Creates a new instance of archivoManagedBean
     */
     private ArrayList<Archivo> listaarchivo;
    private Archivo archivonuevo;
    private Archivo archivosel;
    
    public archivoManagedBean() {
        archivonuevo = new Archivo();
    }

    public ArrayList<Archivo> getListaarchivo() {
        return listaarchivo;
    }

    public void setListaarchivo(ArrayList<Archivo> listaarchivo) {
        this.listaarchivo = listaarchivo;
    }

    public Archivo getArchivonuevo() {
        return archivonuevo;
    }

    public void setArchivonuevo(Archivo archivonuevo) {
        this.archivonuevo = archivonuevo;
    }

    public Archivo getArchivosel() {
        return archivosel;
    }

    public void setArchivosel(Archivo archivosel) {
        this.archivosel = archivosel;
    }
    public void ingresarArchivo() {
        try {
            if (archivoLN.insertarArchivo(archivonuevo)) {
                FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO,
                        "Ingreso correcto ", "Los datos se guadaron correctamente");
                FacesContext.getCurrentInstance().addMessage("successInfo", facesMsg);
               }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
