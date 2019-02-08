/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos;

/**
 *
 * @author dome9
 */
public class listaIngresos {

    //analisis
    private int Id_Segmento;
    private int Id_Flora;
    private Double Dimension_Altura;
    private Double Dimension_Ancho;
    private Double Dimension_Razon;
    private Double Dimension_Rango;
    private String Descripcion;
    private String Ficha;

    //familia
    private Integer Id_Familia;
    private String Nombre_Familia;

    //flora
    private Integer Id_User;
    private String Nombre_Flora;
    private Double UbicacionX;
    private Double UbicacionY;
    private String Cod_Herbario;
    private String Nombre_Investigador;
    private Integer Id_Reserva;
    private String Recoleccion;

    //reserva
    private Integer Id_Reservas;
    private String Nombre_Res;

    //segmento
    private String Nombre_Segm;

    public listaIngresos(int Id_Segmento, int Id_Flora, Double Dimension_Altura, Double Dimension_Ancho, Double Dimension_Razon, Double Dimension_Rango, String Descripcion, String Ficha, Integer Id_Familia, String Nombre_Familia, Integer Id_User, String Nombre_Flora, Double UbicacionX, Double UbicacionY, String Cod_Herbario, String Nombre_Investigador, Integer Id_Reserva, String Recoleccion, Integer Id_Reservas, String Nombre_Res, String Nombre_Segm) {
	this.Id_Segmento = Id_Segmento;
	this.Id_Flora = Id_Flora;
	this.Dimension_Altura = Dimension_Altura;
	this.Dimension_Ancho = Dimension_Ancho;
	this.Dimension_Razon = Dimension_Razon;
	this.Dimension_Rango = Dimension_Rango;
	this.Descripcion = Descripcion;
	this.Ficha = Ficha;
	this.Id_Familia = Id_Familia;
	this.Nombre_Familia = Nombre_Familia;
	this.Id_User = Id_User;
	this.Nombre_Flora = Nombre_Flora;
	this.UbicacionX = UbicacionX;
	this.UbicacionY = UbicacionY;
	this.Cod_Herbario = Cod_Herbario;
	this.Nombre_Investigador = Nombre_Investigador;
	this.Id_Reserva = Id_Reserva;
	this.Recoleccion = Recoleccion;
	this.Id_Reservas = Id_Reservas;
	this.Nombre_Res = Nombre_Res;
	this.Nombre_Segm = Nombre_Segm;
    }

    public listaIngresos(){
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

    public String getFicha() {
	return Ficha;
    }

    public void setFicha(String Ficha) {
	this.Ficha = Ficha;
    }

    public Integer getId_Familia() {
	return Id_Familia;
    }

    public void setId_Familia(Integer Id_Familia) {
	this.Id_Familia = Id_Familia;
    }

    public String getNombre_Familia() {
	return Nombre_Familia;
    }

    public void setNombre_Familia(String Nombre_Familia) {
	this.Nombre_Familia = Nombre_Familia;
    }

    public Integer getId_User() {
	return Id_User;
    }

    public void setId_User(Integer Id_User) {
	this.Id_User = Id_User;
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

    public Integer getId_Reserva() {
	return Id_Reserva;
    }

    public void setId_Reserva(Integer Id_Reserva) {
	this.Id_Reserva = Id_Reserva;
    }

    public String getRecoleccion() {
	return Recoleccion;
    }

    public void setRecoleccion(String Recoleccion) {
	this.Recoleccion = Recoleccion;
    }

    public Integer getId_Reservas() {
	return Id_Reservas;
    }

    public void setId_Reservas(Integer Id_Reservas) {
	this.Id_Reservas = Id_Reservas;
    }

    public String getNombre_Res() {
	return Nombre_Res;
    }

    public void setNombre_Res(String Nombre_Res) {
	this.Nombre_Res = Nombre_Res;
    }

    public String getNombre_Segm() {
	return Nombre_Segm;
    }

    public void setNombre_Segm(String Nombre_Segm) {
	this.Nombre_Segm = Nombre_Segm;
    }
    
    
    
}
