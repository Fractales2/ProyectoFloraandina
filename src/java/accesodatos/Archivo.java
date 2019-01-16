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
public class Archivo {
    private String Id_Archivo;
    private String Id_Flora;
    private String Archivo;
    private String Formula;

     public Archivo() {
        
    }
    public Archivo(String Id_Archivo, String Id_Flora, String Archivo, String Formula) {
        this.Id_Archivo = Id_Archivo;
        this.Id_Flora = Id_Flora;
        this.Archivo = Archivo;
        this.Formula = Formula;
    }

   

    public String getId_Archivo() {
        return Id_Archivo;
    }

    public void setId_Archivo(String Id_Archivo) {
        this.Id_Archivo = Id_Archivo;
    }

    public String getId_Flora() {
        return Id_Flora;
    }

    public void setId_Flora(String Id_Flora) {
        this.Id_Flora = Id_Flora;
    }

    public String getArchivo() {
        return Archivo;
    }

    public void setArchivo(String Archivo) {
        this.Archivo = Archivo;
    }

    public String getFormula() {
        return Formula;
    }

    public void setFormula(String Formula) {
        this.Formula = Formula;
    }
    
    
}
