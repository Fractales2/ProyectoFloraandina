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
public class Imagen {
  
    private String Id_Imagen;
    private Byte Imagen_Frontal;
    private Byte Imagen_Corte;
    private Byte Imagen_Lateral;
    private Byte Imagen_Senital;

    public Imagen(String Id_Imagen, Byte Imagen_Frontal, Byte Imagen_Corte, Byte Imagen_Lateral, Byte Imagen_Senital) {
        this.Id_Imagen = Id_Imagen;
        this.Imagen_Frontal = Imagen_Frontal;
        this.Imagen_Corte = Imagen_Corte;
        this.Imagen_Lateral = Imagen_Lateral;
        this.Imagen_Senital = Imagen_Senital;
    }

    public Imagen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getId_Imagen() {
        return Id_Imagen;
    }

    public void setId_Imagen(String Id_Imagen) {
        this.Id_Imagen = Id_Imagen;
    }

    public Byte getImagen_Frontal() {
        return Imagen_Frontal;
    }

    public void setImagen_Frontal(Byte Imagen_Frontal) {
        this.Imagen_Frontal = Imagen_Frontal;
    }

    public Byte getImagen_Corte() {
        return Imagen_Corte;
    }

    public void setImagen_Corte(Byte Imagen_Corte) {
        this.Imagen_Corte = Imagen_Corte;
    }

    public Byte getImagen_Lateral() {
        return Imagen_Lateral;
    }

    public void setImagen_Lateral(Byte Imagen_Lateral) {
        this.Imagen_Lateral = Imagen_Lateral;
    }

    public Byte getImagen_Senital() {
        return Imagen_Senital;
    }

    public void setImagen_Senital(Byte Imagen_Senital) {
        this.Imagen_Senital = Imagen_Senital;
    }
    
    
}
