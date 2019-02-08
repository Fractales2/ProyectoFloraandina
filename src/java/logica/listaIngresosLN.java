/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import accesodatos.Usuario;
import accesodatos.listaIngresos;
import conexionBD.AccesoDatos;
import conexionBD.ConjuntoResultado;
import conexionBD.Parametro;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.FacesContext;

/**
 *
 * @author dome9
 */
public class listaIngresosLN {

    public ArrayList<listaIngresos> listarIngresos() {

	ArrayList<listaIngresos> listaIngresos = new ArrayList<>();

	FacesContext context = FacesContext.getCurrentInstance();
	Usuario usu = (Usuario) context.getExternalContext().getSessionMap().get("usuario");

	String sql = "SELECT \"Nombre_Flora\", \"Nombre_Familia\", \"Nombre_Reserva\", \"UbicacionX\", \"UbicacionY\", \"Recoleccion\", \"Nombre_Investigador\", \"Id_Flora\"\n"
		+ "	FROM public.\"FLORA\" INNER JOIN public.\"FAMILIA\" \n"
		+ "	ON public.\"FLORA\".\"Id_Familia\" = public.\"FAMILIA\".\"Id_Familia\" \n"
		+ "	INNER JOIN public.\"RESERVA\"	\n"
		+ "	ON public.\"FLORA\".\"Id_Reserva\" = public.\"RESERVA\".\"Id_Reserva\" \n"
		+ "	WHERE public.\"FLORA\".\"Id_User\" ='"+ usu.getId_User()+"';";

	try {

	    ConjuntoResultado resultado = AccesoDatos.ejecutaQuery(sql);
	    listaIngresos lista;
	    while (resultado.next()) {
		lista = new listaIngresos();
		lista.setNombre_Flora(resultado.getString(0));
		lista.setNombre_Familia(resultado.getString(1));
		lista.setNombre_Res(resultado.getString(2));
		lista.setUbicacionX(resultado.getDouble(3));
		lista.setUbicacionY(resultado.getDouble(4));
		lista.setRecoleccion(resultado.getString(5));
		lista.setNombre_Investigador(resultado.getString(6));
		lista.setId_Flora(resultado.getInt(7));
		
		listaIngresos.add(lista);
	    }
	} catch (Exception ex) {
	    Logger.getLogger(listaIngresosLN.class.getName()).log(Level.SEVERE, null, ex);
	    System.out.println(ex.getMessage());
	}
	return listaIngresos;
    }
//lista analisis
    public ArrayList<listaIngresos> listarAnalisis(int idFlora) {
	    FacesContext context = FacesContext.getCurrentInstance();
            Usuario usu = (Usuario) context.getExternalContext().getSessionMap().get("usuario");
	ArrayList<listaIngresos> listaAnalisis = new ArrayList<>();
	listaIngresos listI = new listaIngresos();
	String sql = "SELECT \"Nombre_Segmento\", \"Dimension_Altura\", \"Dimension_Ancho\", \"Dimension_Razon\", \"Dimension_Rango\", \"Descripcion\", \"Ficha\"\n" +
"	FROM public.\"ANALISIS\" INNER JOIN public.\"SEGMENTO\"\n" +
"	ON public.\"ANALISIS\".\"Id_Segmento\" = public.\"SEGMENTO\".\"Id_Segmento\"\n" +
"	WHERE public.\"ANALISIS\".\"Id_Flora\"='"+idFlora+"';";

	try {

	    ConjuntoResultado resultado = AccesoDatos.ejecutaQuery(sql);
	    listaIngresos lista;
	    while (resultado.next()) {
		lista = new listaIngresos();
		lista.setNombre_Segm(resultado.getString(0));
		lista.setDimension_Altura(resultado.getDouble(1));
		lista.setDimension_Ancho(resultado.getDouble(2));
		lista.setDimension_Razon(resultado.getDouble(3));
		lista.setDimension_Rango(resultado.getDouble(4));
		lista.setDescripcion(resultado.getString(5));
		lista.setFicha(resultado.getString(6));
		listaAnalisis.add(lista);
	    }
	} catch (Exception ex) {
	    Logger.getLogger(listaIngresosLN.class.getName()).log(Level.SEVERE, null, ex);
	    System.out.println(ex.getMessage());
	}
	return listaAnalisis;
    }
   
}
