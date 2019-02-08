/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testeos;

import accesodatos.listaIngresos;
import java.util.ArrayList;
import logica.listaIngresosLN;

/**
 *
 * @author dome9
 */
public class TListaIngresos {

    public static void main(String[] args) {
	listaIngresosLN lt = new listaIngresosLN();
	System.out.println("---Listado de familias---");
	ArrayList<listaIngresos> list1 = new ArrayList<>();
	list1 = lt.listarIngresos();
	for (listaIngresos s1 : list1) {
	    //System.out.println(s.getId_Familia());
	    System.out.println(s1.getNombre_Familia());
	    System.out.println();
	}

    }
}
