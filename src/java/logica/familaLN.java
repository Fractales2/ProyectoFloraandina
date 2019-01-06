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
import accesodatos.Familia;
/**
 *
 * @author ASUS
 */
public class familaLN {
    
     public static boolean insertarFamilia(Familia familia) {
       
         boolean resp = false;
        ArrayList<Parametro> lstpar = new ArrayList<>();
        //lstpar.add(new Parametro(1,familia.getId_Familia()));
        lstpar.add(new Parametro(1, familia.getId_Familia()));
        lstpar.add(new Parametro(2, familia.getNombre_Familia()));
        String sql = "INSERT INTO public.\"FAMILIA\"(\n" +
"	\"Id_Familia\", \"Nombre_Familia\")\n" +
    "	VALUES (?,?);";            
//"	VALUES ('" + familia.getId_Familia() + "','" + familia.getNombre_Familia() + "');";
        try {
            resp = AccesoDatos.ejecutaComando1(sql, lstpar);
        } catch (Exception ex) {
            Logger.getLogger(familaLN.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        return resp;
    }
}
