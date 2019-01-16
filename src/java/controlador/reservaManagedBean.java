/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import accesodatos.Reservas;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import logica.reservaLN;

/**
 *
 * @author ASUS
 */
@Named(value = "reservaManagedBean")
@SessionScoped
public class reservaManagedBean implements Serializable {
    private ArrayList<Reservas> listareservas;
    private Integer Id_Reservas;
    private String Nombre_Res;

    
    /**
     * Creates a new instance of reservaManagedBean
     */
    public reservaManagedBean() {
        cargarReserva();
    }
    public final void cargarReserva(){
        listareservas = reservaLN.obtenerReservas();
    }

    public ArrayList<Reservas> getListareservas() {
        return listareservas;
    }

    public void setListareservas(ArrayList<Reservas> listareservas) {
        this.listareservas = listareservas;
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
    
    
}
