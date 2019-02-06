/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import accesodatos.Familia;
import accesodatos.Flora;
import accesodatos.Reservas;
import accesodatos.Segmento;
import accesodatos.Usuario;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import logica.floraLN;
import controlador.familiaManagedBean;
import java.util.Date;
import javax.inject.Named;
import logica.familaLN;
import logica.reservaLN;
import logica.segmentoLN;

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
    private Flora florasel;

    private Integer Id_Flora;
    private Integer Id_User;
    private Integer Id_Familia;
    private String Nombre_Flora;
    private Double UbicacionX;
    private Double UbicacionY;
    private String Cod_Herbario;
    private String Nombre_Investigador;
    private Integer Id_Reserva;
    private String Recoleccion;
    //probar familia
    private String nombreFamilia;
    private String nombreFamiliaAUX;
    private int idfamilia;
    //reservas
    private Integer Id_Reservas;
    private String Nombre_Res;
    private String Nombre_ResAUX;
    //segmento
    private String nombreSegmento;
    private String nombreSegmentoAux;
    private int idsegmento;

    public floraManagedBean() {
        //ingresarFlora();
        florasel = new Flora();
        cargarFamilia();
        cargarReserva();
        cargarSegmento();

    }

    public Integer getId_Reservas() {
        return Id_Reservas;
    }

    public void setId_Reservas(Integer Id_Reservas) {
        this.Id_Reservas = Id_Reservas;
    }

    public String getNombre_Res() {
        return Nombre_Res;
    }

    public void setNombre_Res(String Nombre_Res) {
        this.Nombre_Res = Nombre_Res;
    }

    public String getNombre_ResAUX() {
        return Nombre_ResAUX;
    }

    public void setNombre_ResAUX(String Nombre_ResAUX) {
        this.Nombre_ResAUX = Nombre_ResAUX;
    }

    public Integer getId_Flora() {
        return Id_Flora;
    }

    public void setId_Flora(Integer Id_Flora) {
        this.Id_Flora = Id_Flora;
    }

    public Integer getId_User() {
        return Id_User;
    }

    public void setId_User(Integer Id_User) {
        this.Id_User = Id_User;
    }

    public Integer getId_Familia() {
        return Id_Familia;
    }

    public void setId_Familia(Integer Id_Familia) {
        this.Id_Familia = Id_Familia;
    }

    public String getNombre_Flora() {
        return Nombre_Flora;
    }

    public void setNombre_Flora(String Nombre_Flora) {
        this.Nombre_Flora = Nombre_Flora;
    }

    public Double getUbicacionX() {
        return UbicacionX;
    }

    public void setUbicacionX(Double UbicacionX) {
        this.UbicacionX = UbicacionX;
    }

    public Double getUbicacionY() {
        return UbicacionY;
    }

    public void setUbicacionY(Double UbicacionY) {
        this.UbicacionY = UbicacionY;
    }

    public String getCod_Herbario() {
        return Cod_Herbario;
    }

    public void setCod_Herbario(String Cod_Herbario) {
        this.Cod_Herbario = Cod_Herbario;
    }

    public String getNombre_Investigador() {
        return Nombre_Investigador;
    }

    public void setNombre_Investigador(String Nombre_Investigador) {
        this.Nombre_Investigador = Nombre_Investigador;
    }

    public Integer getId_Reserva() {
        return Id_Reserva;
    }

    public void setId_Reserva(Integer Id_Reserva) {
        this.Id_Reserva = Id_Reserva;
    }

    public String getRecoleccion() {
        return Recoleccion;
    }

    public void setRecoleccion(String Recoleccion) {
        this.Recoleccion = Recoleccion;
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

   

    public ArrayList<Flora> getListafamilia() {
        return listafamilia;
    }

    public void setListafamilia(ArrayList<Flora> listafamilia) {
        this.listafamilia = listafamilia;
    }

    public Flora getFlorasel() {
        return florasel;
    }

    public void setFlorasel(Flora florasel) {
        this.florasel = florasel;
    }
//probar datos

    public String getNombreFamilia() {
        return nombreFamilia;
    }

    public void setNombreFamilia(String nombreFamilia) {
        this.nombreFamilia = nombreFamilia;
    }

    public String getNombreFamiliaAUX() {
        return nombreFamiliaAUX;
    }

    public void setNombreFamiliaAUX(String nombreFamiliaAUX) {
        this.nombreFamiliaAUX = nombreFamiliaAUX;
    }

    public int getIdfamilia() {
        return idfamilia;
    }

    public void setIdfamilia(int idfamilia) {
        this.idfamilia = idfamilia;
    }

    //segmento
    public final ArrayList<String> cargarSegmento() {
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<Segmento> listasegmento = segmentoLN.obtenerSegmento();

        for (Segmento s : listasegmento) {

            lista.add(s.getNombre_Segm());
        }
        return lista;
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

    //reserva
    //ingresar reserva
    public int ingresarreserva() {
        Reservas objRes = new Reservas();
        //lista.add(nombreSegmento);
        objRes.setNombre_Res(Nombre_Res);
        Reservas res = reservaLN.obtenerIdReserva(objRes);
        Nombre_ResAUX = res.getId_Reservas().toString();
        Id_Reservas = Integer.parseInt(Nombre_ResAUX);
        return Id_Reservas;
    }

    public final ArrayList<String> cargarReserva() {
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<Reservas> listareserva = reservaLN.obtenerReservas();

        for (Reservas s : listareserva) {

            lista.add(s.getNombre_Res());
        }
        return lista;
    }

    //familia
    public final ArrayList<String> cargarFamilia() {
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<Familia> listafami = familaLN.obtenerFamilias();

        for (Familia s : listafami) {

            lista.add(s.getNombre_Familia());
        }
        return lista;
    }

    //ingresar familia
    public int ingresar() {
        Familia objFam = new Familia();
        //lista.add(nombreSegmento);
        objFam.setNombre_Familia(nombreFamilia);
        Familia fam = familaLN.obtenerIdFamilia(objFam);
        nombreFamiliaAUX = fam.getId_Familia().toString();
        idfamilia = Integer.parseInt(nombreFamiliaAUX);
        return idfamilia;
    }

    //funciones
    public void ingresarFlora() {

        familiaManagedBean objFam = new familiaManagedBean();
        segmentoManagedBean objSeg = new segmentoManagedBean();
        reservaManagedBean objRes = new reservaManagedBean();

        Flora objFlora = new Flora();

        FacesContext context = FacesContext.getCurrentInstance();
        Usuario usu = (Usuario) context.getExternalContext().getSessionMap().get("usuario");
        objFlora.setId_User(usu.getId_User());
        objFlora.setNombre_Flora(Nombre_Flora);
        objFlora.setUbicacionX(UbicacionX);
        objFlora.setUbicacionY(UbicacionY);
        objFlora.setCod_Herbario(Nombre_Flora);
        objFlora.setNombre_Investigador(Nombre_Investigador);
        objFlora.setId_Familia(ingresar());
        objFlora.setId_Reserva(ingresarreserva());
        objFlora.setRecoleccion(Recoleccion);

        floraLN.insertarFlora(objFlora);

        
    }
    
    
}
