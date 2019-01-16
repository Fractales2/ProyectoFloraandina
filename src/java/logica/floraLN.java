/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import conexionBD.AccesoDatos;
import conexionBD.ConjuntoResultado;
import conexionBD.Parametro;
import accesodatos.Flora;
/**
 *
 * @author ASUS
 */
public class floraLN {
    public static boolean insertarFlora(Flora flora) {
       
        boolean resp = false;
        ArrayList<Parametro> lstpar = new ArrayList<>();
        lstpar.add(new Parametro(1,flora.getId_Flora()));
        lstpar.add(new Parametro(2,flora.getId_User()));
        lstpar.add(new Parametro(3,flora.getId_Familia()));
        lstpar.add(new Parametro(4,flora.getNombre_Flora()));
        lstpar.add(new Parametro(5,flora.getUbicacionX()));
        lstpar.add(new Parametro(6,flora.getUbicacionY()));
        lstpar.add(new Parametro(7,flora.getCod_Herbario()));
        lstpar.add(new Parametro(8,flora.getNombre_Investigador()));
        lstpar.add(new Parametro(9,flora.getRecoleccion()));
        lstpar.add(new Parametro(10,flora.getId_Segmento1()));
        lstpar.add(new Parametro(11,flora.getFicha()));
       
        
        String sql = "INSERT INTO public.\"FLORA\"(\n" +
"	\"Id_Flora\", \"Id_User\", \"Id_Familia\", \"Nombre_Flora\", \"UbicacionX\", \"UbicacionY\", \"Cod_Herbario\", \"Nombre_Investigador\", \"Recoleccion\", \"Id_Segmento1\", \"Ficha\")\n" +
"	VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";            
//"	VALUES ('" + familia.getId_Familia() + "','" + familia.getNombre_Familia() + "');";
        try {
            resp = AccesoDatos.ejecutaComando1(sql, lstpar);
        } catch (Exception ex) {
            Logger.getLogger(floraLN.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        return resp;
    }
}
