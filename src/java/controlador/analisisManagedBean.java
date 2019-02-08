/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import accesodatos.Analisis;
import accesodatos.Segmento;
import accesodatos.Usuario;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import javafx.scene.text.Text;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import logica.analisiLN;
import logica.floraLN;
import logica.segmentoLN;

/**
 *
 * @author ASUS
 */
@Named(value = "analisisManagedBean")
@SessionScoped
public final class analisisManagedBean implements Serializable {

    /**
     * Creates a new instance of analisisManagedBean
     */
    
    private ArrayList<Analisis> listaanalisis;
    private Analisis analisisnuevo;
    private Analisis analisissel;
    private int Id_Flora;
    private int Id_Segmento;
    private Double Dimension_Altura;
    private Double Dimension_Ancho;
    private Double Dimension_Razon;
    private Double Dimension_Rango;
    private String Descripcion;
    private String Ficha;
    private String nombre_Flora;
    private int id_Flora;
    //segmento
    private String nombreSegmento;
    private String nombreSegmentoAux;
    private int idsegmento;
    
    public analisisManagedBean() {
        cargarSegmento();
        obtenerFlora();
    }

    public String getNombre_Flora() {
        return nombre_Flora;
    }

    public void setNombre_Flora(String nombre_Flora) {
        this.nombre_Flora = nombre_Flora;
    }

    public String getNombreSegmento() {
        return nombreSegmento;
    }

    public void setNombreSegmento(String nombreSegmento) {
        this.nombreSegmento = nombreSegmento;
    }

    public String getNombreSegmentoAux() {
        return nombreSegmentoAux;
    }

    public void setNombreSegmentoAux(String nombreSegmentoAux) {
        this.nombreSegmentoAux = nombreSegmentoAux;
    }

    public int getIdsegmento() {
        return idsegmento;
    }

    public void setIdsegmento(int idsegmento) {
        this.idsegmento = idsegmento;
    }

    

    public int getId_Segmento() {
        return Id_Segmento;
    }

    public void setId_Segmento(int Id_Segmento) {
        this.Id_Segmento = Id_Segmento;
    }

    public int getId_Flora() {
        return Id_Flora;
    }

    public void setId_Flora(int Id_Flora) {
        this.Id_Flora = Id_Flora;
    }

    public Double getDimension_Altura() {
        return Dimension_Altura;
    }

    public void setDimension_Altura(Double Dimension_Altura) {
        this.Dimension_Altura = Dimension_Altura;
    }

    public Double getDimension_Ancho() {
        return Dimension_Ancho;
    }

    public void setDimension_Ancho(Double Dimension_Ancho) {
        this.Dimension_Ancho = Dimension_Ancho;
    }

    public Double getDimension_Razon() {
        return Dimension_Razon;
    }

    public void setDimension_Razon(Double Dimension_Razon) {
        this.Dimension_Razon = Dimension_Razon;
    }

    public Double getDimension_Rango() {
        return Dimension_Rango;
    }

    public void setDimension_Rango(Double Dimension_Rango) {
        this.Dimension_Rango = Dimension_Rango;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    

    public String getFicha() {
        return Ficha;
    }

    public void setFicha(String Ficha) {
        this.Ficha = Ficha;
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

    public int ingresarsegmento() {
        Segmento objSeg = new Segmento();
        //lista.add(nombreSegmento);
        objSeg.setNombre_Segm(nombreSegmento);
        Segmento seg = segmentoLN.obtenerIdSegmento(objSeg);
        nombreSegmentoAux = seg.getId_Segmento().toString();
        idsegmento = Integer.parseInt(nombreSegmentoAux);
        return idsegmento;

    }

    public final ArrayList<String> cargarSegmento() {
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<Segmento> listasegmento = segmentoLN.obtenerSegmento();

        for (Segmento s : listasegmento) {

            lista.add(s.getNombre_Segm());
        }
        return lista;
    }
//fin segmento
    public void obtenerFlora() {
        try {
            FacesContext context = FacesContext.getCurrentInstance();
            Usuario usu = (Usuario) context.getExternalContext().getSessionMap().get("usuario");
            floraLN objF = new floraLN();
            id_Flora = (objF.obtenerFlora(usu.getId_User())).getId_Flora();
            nombre_Flora = (objF.obtenerFlora(usu.getId_User())).getNombre_Flora();

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public void ingresarAnalisis() {
        try {
            Analisis objA = new Analisis();
            
            objA.setId_Segmento(ingresarsegmento());
            objA.setId_Flora(id_Flora);
            objA.setDimension_Altura(Dimension_Altura);
            objA.setDimension_Ancho(Dimension_Ancho);
            objA.setDimension_Rango(Dimension_Rango);
            objA.setDimension_Razon(Dimension_Altura/Dimension_Ancho);
            objA.setDescripcion(Descripcion);
            
            objA.setFicha("");

            if (analisiLN.insertarAnalisis(objA)) {
                FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO,
                        "Ingreso correcto ", "Los datos se guadaron correctamente");
                FacesContext.getCurrentInstance().addMessage("successInfo", facesMsg);
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

}
