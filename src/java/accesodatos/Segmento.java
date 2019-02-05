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
public class Segmento {
    private String Nombre_Segm;
    private Integer Id_Segmento;

    public Segmento() {
        
    }
    public Segmento(String Nombre_Segm, Integer Id_Segmento) {
 
        this.Nombre_Segm = Nombre_Segm;
        this.Id_Segmento = Id_Segmento;
    }

    public String getNombre_Segm() {
        return Nombre_Segm;
    }

    public void setNombre_Segm(String Nombre_Segm) {
        this.Nombre_Segm = Nombre_Segm;
    }

    public Integer getId_Segmento() {
        return Id_Segmento;
    }

    public void setId_Segmento(Integer Id_Segmento) {
        this.Id_Segmento = Id_Segmento;
    }

   
    
}
