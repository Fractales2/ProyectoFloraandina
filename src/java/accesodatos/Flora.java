/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos;

import java.sql.Date;

/**
 *
 * @author ASUS
 */
public class Flora {
    private String Id_Flora;
    private String Id_User;
    private String Id_Imagen;
    private String Id_Familia;
    private String Nombre_Flora;
    private Double UbicacionX;
    private Double UbicacionY;
    private Date   Recoleccion;
    private String Cod_Herbario;
    private String Nombre_Investigador;

    public Flora(String Id_Flora, String Id_User, String Id_Imagen, String Id_Familia, String Nombre_Flora, Double UbicacionX, Double UbicacionY, Date Recoleccion, String Cod_Herbario, String Nombre_Investigador) {
        this.Id_Flora = Id_Flora;
        this.Id_User = Id_User;
        this.Id_Imagen = Id_Imagen;
        this.Id_Familia = Id_Familia;
        this.Nombre_Flora = Nombre_Flora;
        this.UbicacionX = UbicacionX;
        this.UbicacionY = UbicacionY;
        this.Recoleccion = Recoleccion;
        this.Cod_Herbario = Cod_Herbario;
        this.Nombre_Investigador = Nombre_Investigador;
    }
    

    public String getId_Flora() {
        return Id_Flora;
    }

    public Date getRecoleccion() {
        return Recoleccion;
    }

    public void setRecoleccion(Date Recoleccion) {
        this.Recoleccion = Recoleccion;
    }

    public void setId_Flora(String Id_Flora) {
        this.Id_Flora = Id_Flora;
    }

    public String getId_User() {
        return Id_User;
    }

    public void setId_User(String Id_User) {
        this.Id_User = Id_User;
    }

    public String getId_Imagen() {
        return Id_Imagen;
    }

    public void setId_Imagen(String Id_Imagen) {
        this.Id_Imagen = Id_Imagen;
    }

    public String getId_Familia() {
        return Id_Familia;
    }

    public void setId_Familia(String Id_Familia) {
        this.Id_Familia = Id_Familia;
    }

    public String getNombre_Flora() {
        return Nombre_Flora;
    }

    public void setNombre_Flora(String Nombre_Flora) {
        this.Nombre_Flora = Nombre_Flora;
    }

    public Double getUbicacionX() {
        return UbicacionX;
    }

    public void setUbicacionX(Double UbicacionX) {
        this.UbicacionX = UbicacionX;
    }

    public Double getUbicacionY() {
        return UbicacionY;
    }

    public void setUbicacionY(Double UbicacionY) {
        this.UbicacionY = UbicacionY;
    }

   

    public String getCod_Herbario() {
        return Cod_Herbario;
    }

    public void setCod_Herbario(String Cod_Herbario) {
        this.Cod_Herbario = Cod_Herbario;
    }

    public String getNombre_Investigador() {
        return Nombre_Investigador;
    }

    public void setNombre_Investigador(String Nombre_Investigador) {
        this.Nombre_Investigador = Nombre_Investigador;
    }
    
    
}
