/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos;

import javax.persistence.Lob;

/**
 *
 * @author ASUS
 */
public class Imagen {
  
    private Integer Id_Imagen;
    @Lob()
    private byte[] Imagen;
    private String Tipo_Imagen; 
    private Integer Id_Galeria;
    private String enunciado;

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
    
    
      
 
     public Imagen() {
    
    }

    public Imagen(Integer Id_Imagen, byte[] Imagen, String Tipo_Imagen, Integer Id_Galeria) {
        this.Id_Imagen = Id_Imagen;
        this.Imagen = Imagen;
        this.Tipo_Imagen = Tipo_Imagen;
        this.Id_Galeria = Id_Galeria;
    }

    public Integer getId_Imagen() {
        return Id_Imagen;
    }

    public void setId_Imagen(Integer Id_Imagen) {
        this.Id_Imagen = Id_Imagen;
    }

    public byte[] getImagen() {
        return Imagen;
    }

    public void setImagen(byte[] Imagen) {
        this.Imagen = Imagen;
    }

    public String getTipo_Imagen() {
        return Tipo_Imagen;
    }

    public void setTipo_Imagen(String Tipo_Imagen) {
        this.Tipo_Imagen = Tipo_Imagen;
    }

    public Integer getId_Galeria() {
        return Id_Galeria;
    }

    public void setId_Galeria(Integer Id_Galeria) {
        this.Id_Galeria = Id_Galeria;
    }
     
      
    
    
}
