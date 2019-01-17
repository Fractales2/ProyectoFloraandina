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
    private Integer Id_Flora;
    private Integer Id_User;
    private Integer Id_Familia;
    private String Nombre_Flora;
    private Double UbicacionX;
    private Double UbicacionY;
    private Date   Recoleccion;
    private String Cod_Herbario;
    private String Ficha;
    private String Nombre_Investigador;
    private Integer Id_Segmento1;
    
     public Flora() {
     
    }

    public Flora(Integer Id_Flora, Integer Id_User, Integer Id_Familia, String Nombre_Flora, Double UbicacionX, Double UbicacionY, Date Recoleccion, String Cod_Herbario, String Nombre_Investigador, String Ficha, Integer Id_Segmento1) {
        this.Id_Flora = Id_Flora;
        this.Id_User = Id_User;
        this.Id_Familia = Id_Familia;
        this.Nombre_Flora = Nombre_Flora;
        this.UbicacionX = UbicacionX;
        this.UbicacionY = UbicacionY;
        this.Recoleccion = Recoleccion;
        this.Cod_Herbario = Cod_Herbario;
        this.Nombre_Investigador = Nombre_Investigador;
        this.Ficha = Ficha;
        this.Id_Segmento1 = Id_Segmento1;
    }

   

    public Integer getId_Flora() {
        return Id_Flora;
    }

    public void setId_Flora(Integer Id_Flora) {
        this.Id_Flora = Id_Flora;
    }

    public Integer getId_User() {
        return Id_User;
    }

    public void setId_User(Integer Id_User) {
        this.Id_User = Id_User;
    }

    public Integer getId_Familia() {
        return Id_Familia;
    }

    public void setId_Familia(Integer Id_Familia) {
        this.Id_Familia = Id_Familia;
    }

    public Integer getId_Segmento1() {
        return Id_Segmento1;
    }

    public void setId_Segmento1(Integer Id_Segmento1) {
        this.Id_Segmento1 = Id_Segmento1;
    }

    public String getFicha() {
        return Ficha;
    }

    public void setFicha(String Ficha) {
        this.Ficha = Ficha;
    }
    

    public Date getRecoleccion() {
        return Recoleccion;
    }

    public void setRecoleccion(Date Recoleccion) {
        this.Recoleccion = Recoleccion;
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
