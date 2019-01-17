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
    private Integer Id_Segmento1;
    private String Nombre_Segm;
    private Integer Id_Segmento;

    public Segmento() {
        
    }
    public Segmento(Integer Id_Segmento1, String Nombre_Segm, Integer Id_Segmento) {
        this.Id_Segmento1 = Id_Segmento1;
        this.Nombre_Segm = Nombre_Segm;
        this.Id_Segmento = Id_Segmento;
    }

    

    public Integer getId_Segmento1() {
        return Id_Segmento1;
    }

    public void setId_Segmento1(Integer Id_Segmento1) {
        this.Id_Segmento1 = Id_Segmento1;
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
