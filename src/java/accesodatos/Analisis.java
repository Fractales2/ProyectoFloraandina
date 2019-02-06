/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos;

import javafx.scene.text.Text;

/**
 *
 * @author ASUS
 */
public class Analisis {
    private int Id_Segmento;
    private int Id_Flora;
    private Double Dimension_Altura;
    private Double Dimension_Ancho;
    private Double Dimension_Razon;
    private Double Dimension_Rango;
    private String Descripcion;
    private String Ficha;
    
     public Analisis() {
    
    }

    public Analisis(int Id_Segmento, int Id_Flora, String Ficha, Double Dimension_Altura, Double Dimension_Ancho, Double Dimension_Razon, Double Dimension_Rango, String Descripcion) {
        this.Id_Segmento = Id_Segmento;
        this.Id_Flora = Id_Flora;
        this.Ficha = Ficha;
        this.Dimension_Altura = Dimension_Altura;
        this.Dimension_Ancho = Dimension_Ancho;
        this.Dimension_Razon = Dimension_Razon;
        this.Dimension_Rango = Dimension_Rango;
        this.Descripcion = Descripcion;
    }

    public int getId_Segmento() {
        return Id_Segmento;
    }

    public void setId_Segmento(int Id_Segmento) {
        this.Id_Segmento = Id_Segmento;
    }

    public int getId_Flora() {
        return Id_Flora;
    }

    public void setId_Flora(int Id_Flora) {
        this.Id_Flora = Id_Flora;
    }


    public String getFicha() {
        return Ficha;
    }

    public void setFicha(String Ficha) {
        this.Ficha = Ficha;
    }

    
    public Double getDimension_Altura() {
        return Dimension_Altura;
    }

    public void setDimension_Altura(Double Dimension_Altura) {
        this.Dimension_Altura = Dimension_Altura;
    }

    public Double getDimension_Ancho() {
        return Dimension_Ancho;
    }

    public void setDimension_Ancho(Double Dimension_Ancho) {
        this.Dimension_Ancho = Dimension_Ancho;
    }

    public Double getDimension_Razon() {
        return Dimension_Razon;
    }

    public void setDimension_Razon(Double Dimension_Razon) {
        this.Dimension_Razon = Dimension_Razon;
    }

    public Double getDimension_Rango() {
        return Dimension_Rango;
    }

    public void setDimension_Rango(Double Dimension_Rango) {
        this.Dimension_Rango = Dimension_Rango;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    
    
    
}
