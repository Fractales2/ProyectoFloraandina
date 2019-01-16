/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos;

/**
 *
 * @author ASUS
 */
public class Reservas {
    private Integer Id_Reservas;
    private String Nombre_Res;

    public Reservas (){
    }
    public Reservas (Integer Id_Reservas, String Nombre_Familia){
        this.Id_Reservas = Id_Reservas;
        this.Nombre_Res = Nombre_Familia;
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
