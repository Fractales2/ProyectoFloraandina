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
    private String Id_Segmento;
    private String Id_Flora;
    private String Nombre_Tipo;
    private Double Dimension_Altura;
    private Double Dimension_Ancho;
    private Double Dimension_Razon;
    private Double Dimension_Rango;
    private Text Descripcion;

    public Analisis(String Id_Segmento, String Id_Flora, String Nombre_Tipo, Double Dimension_Altura, Double Dimension_Ancho, Double Dimension_Razon, Double Dimension_Rango, Text Descripcion) {
        this.Id_Segmento = Id_Segmento;
        this.Id_Flora = Id_Flora;
        this.Nombre_Tipo = Nombre_Tipo;
        this.Dimension_Altura = Dimension_Altura;
        this.Dimension_Ancho = Dimension_Ancho;
        this.Dimension_Razon = Dimension_Razon;
        this.Dimension_Rango = Dimension_Rango;
        this.Descripcion = Descripcion;
    }

    public Analisis() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getId_Segmento() {
        return Id_Segmento;
    }

    public void setId_Segmento(String Id_Segmento) {
        this.Id_Segmento = Id_Segmento;
    }

    public String getId_Flora() {
        return Id_Flora;
    }

    public void setId_Flora(String Id_Flora) {
        this.Id_Flora = Id_Flora;
    }

    public String getNombre_Tipo() {
        return Nombre_Tipo;
    }

    public void setNombre_Tipo(String Nombre_Tipo) {
        this.Nombre_Tipo = Nombre_Tipo;
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

    public Text getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(Text Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
}
