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
public class Galeria {
    private Integer Id_Galeria;
    private String Tipo_Galeria;
    private Integer Id_Flora;

    public Galeria(Integer Id_Galeria, String Tipo_Galeria, Integer Id_Flora) {
        this.Id_Galeria = Id_Galeria;
        this.Tipo_Galeria = Tipo_Galeria;
        this.Id_Flora = Id_Flora;
    }

    public Galeria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getId_Galeria() {
        return Id_Galeria;
    }

    public void setId_Galeria(Integer Id_Galeria) {
        this.Id_Galeria = Id_Galeria;
    }

    public String getTipo_Galeria() {
        return Tipo_Galeria;
    }

    public void setTipo_Galeria(String Tipo_Galeria) {
        this.Tipo_Galeria = Tipo_Galeria;
    }

    public Integer getId_Flora() {
        return Id_Flora;
    }

    public void setId_Flora(Integer Id_Flora) {
        this.Id_Flora = Id_Flora;
    }
    
    
}
