/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import accesodatos.listaIngresos;
import java.io.Serializable;
import java.util.ArrayList;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import logica.listaIngresosLN;

/**
 *
 * @author dome9
 */
@Named(value = "cListaIngresos")
@SessionScoped

public class cListaIngresos implements Serializable {

    private ArrayList<listaIngresos> list1;
    private listaIngresos listaIng;
 
    private ArrayList<listaIngresos> listAnal;
    private listaIngresos listaAnalisis;
    private int id_flora;

    public cListaIngresos() {
	cargarlistaIngresos();
	listaAnalisis = new listaIngresos();
	
    }

    public cListaIngresos(int id_flora) {
	this.id_flora = id_flora;
    }
    

    public listaIngresos getListaIng() {
	return listaIng;
    }

    public void setListaIng(listaIngresos listaIng) {

	this.listaIng = listaIng;
	id_flora = listaIng.getId_Flora();
	/*listaIngresosLN lt = new listaIngresosLN();
	listAnal = lt.listarAnalisis(listaIng.getId_Flora());
	setListAnal(listAnal);*/
	cargarAnalisis();
    }

    public listaIngresos getListaAnalisis() {
	return listaAnalisis;
    }

    public void setListaAnalisis(listaIngresos listaAnalisis) {
	this.listaAnalisis = listaAnalisis;
    }

    public void cargarlistaIngresos() {
	listaIngresosLN lt = new listaIngresosLN();
	list1 = lt.listarIngresos();
	
    }

    public ArrayList<listaIngresos> getListAnal() {
	return listAnal;
    }

    public void setListAnal(ArrayList<listaIngresos> listAnal) {
	this.listAnal = listAnal;
    }

    public ArrayList<listaIngresos> getList1() {
	return list1;
    }

    public void setList1(ArrayList<listaIngresos> list1) {
	this.list1 = list1;
    }

    public void cargarAnalisis() {
	listaIngresosLN lt = new listaIngresosLN();
	listAnal = lt.listarAnalisis(listaIng.getId_Flora());
	
    }
}
