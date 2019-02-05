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
    
    private ArrayList<Reservas> lista;
    private ArrayList<Reservas> listareserva;
    private Integer Id_Reservas;
    private String Nombre_Res;
    private String Nombre_ResAUX;

    
    /**
     * Creates a new instance of reservaManagedBean
     */
    public reservaManagedBean() {
        cargarReserva();
    }
   
        public final ArrayList<String> cargarReserva() {
      ArrayList<String> lista = new ArrayList<>();  
        listareserva= reservaLN.obtenerReservas();

        for (Reservas s : listareserva) {
            
            lista.add(s.getNombre_Res());
        }
        return lista;
    }
    public ArrayList<Reservas> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Reservas> lista) {
        this.lista = lista;
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
    
    public void ListarReserva(){     
         lista = reservaLN.obtenerReservas();
    }
    public int ingresar() {
        Reservas objRes = new Reservas();
        //lista.add(nombreSegmento);
        objRes.setNombre_Res(Nombre_Res);
        Reservas res = reservaLN.obtenerIdReserva(objRes);
        Nombre_ResAUX = res.getId_Reservas().toString();
        Id_Reservas = Integer.parseInt(Nombre_ResAUX);
         return Id_Reservas;
    }
}
