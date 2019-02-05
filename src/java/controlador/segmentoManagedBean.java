/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import accesodatos.Segmento;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import logica.segmentoLN;
import accesodatos.Segmento;

/**
 *
 * @author ASUS
 */
@Named(value = "segmentoManagedBean")
@SessionScoped
public class segmentoManagedBean implements Serializable {

    /**
     * Creates a new instance of segmentoManagedBean
     */
    private ArrayList<Segmento> listasegmento;
    //private ArrayList<Integer> lista;
    private Segmento segmentonuevo;
    private Segmento segmentosel;
    private String nombreSegmento;
    private String nombreSegmento1;
    private int idsegmento;

    public segmentoManagedBean() {
        cargarSegmento();
    }

    public final ArrayList<String> cargarSegmento() {
      ArrayList<String> lista = new ArrayList<>();  
        listasegmento = segmentoLN.obtenerSegmento();

        for (Segmento s : listasegmento) {
            
            lista.add(s.getNombre_Segm());
        }
        return lista;
    }

    
    public ArrayList<Segmento> getListasegmento() {
        return listasegmento;
    }

    public void setListasegmento(ArrayList<Segmento> listasegmento) {
        this.listasegmento = listasegmento;
    }

    public Segmento getSegmentonuevo() {
        return segmentonuevo;
    }

    public void setSegmentonuevo(Segmento segmentonuevo) {
        this.segmentonuevo = segmentonuevo;
    }

    public Segmento getSegmentosel() {
        return segmentosel;
    }

    public void setSegmentosel(Segmento segmentosel) {
        this.segmentosel = segmentosel;
    }

    public String getNombreSegmento() {
        return nombreSegmento;
    }

    public void setNombreSegmento(String nombreSegmento) {
        this.nombreSegmento = nombreSegmento;
    }

    public int getIdsegmento() {
        return idsegmento;
    }

    public void setIdsegmento(int idsegmento) {
        this.idsegmento = idsegmento;
    }

    public int ingresar() {
        Segmento objSeg = new Segmento();
        //lista.add(nombreSegmento);
        objSeg.setNombre_Segm(nombreSegmento);
         Segmento seg = segmentoLN.obtenerIdSegmento(objSeg);
         nombreSegmento1 = seg.getId_Segmento().toString();
         idsegmento = Integer.parseInt(nombreSegmento1);
         return idsegmento;
          
    }

}
