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
public class Familia {
    private String Id_Familia;
    private String Nombre_Familia;

    public Familia(String Id_Familia, String Nombre_Familia) {
        this.Id_Familia = Id_Familia;
        this.Nombre_Familia = Nombre_Familia;
    }

    public Familia() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getId_Familia() {
        return Id_Familia;
    }

    public void setId_Familia(String Id_Familia) {
        this.Id_Familia = Id_Familia;
    }

    public String getNombre_Familia() {
        return Nombre_Familia;
    }

    public void setNombre_Familia(String Nombre_Familia) {
        this.Nombre_Familia = Nombre_Familia;
    }
    
    
    
}
