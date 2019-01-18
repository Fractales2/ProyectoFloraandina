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
import accesodatos.Archivo;
/**
 *
 * @author ASUS
 */
public class archivoLN {
    
    public static boolean insertarArchivo(Archivo archivo) {
       
         boolean resp = false;
        ArrayList<Parametro> lstpar = new ArrayList<>();
        lstpar.add(new Parametro(1, archivo.getId_Archivo()));
        lstpar.add(new Parametro(2, archivo.getId_Flora()));
        lstpar.add(new Parametro(3, archivo.getArchivo()));
        lstpar.add(new Parametro(4, archivo.getFormula()));
        String sql = "INSERT INTO public.\"ARCHIVO\"(\n" +
"	\"Id_Archivo\", \"Id_Flora\", \"Archivo\", \"Formula\")\n" +
"	VALUES (?, ?, ?, ?);";            
        try {
            resp = AccesoDatos.ejecutaComando1(sql, lstpar);
        } catch (Exception ex) {
            Logger.getLogger(archivoLN.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        return resp;
    }
}
