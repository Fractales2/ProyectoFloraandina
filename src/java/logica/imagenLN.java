/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import accesodatos.Imagen;
import conexionBD.AccesoDatos;
import conexionBD.Parametro;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class imagenLN {
    public static boolean insertarImagen(Imagen imagen) {
       
         boolean resp = false;
        ArrayList<Parametro> lstpar = new ArrayList<>();
         lstpar.add(new Parametro(1, imagen.getId_Imagen()));
        lstpar.add(new Parametro(2, imagen.getTipo_Imagen()));
        lstpar.add(new Parametro(3, imagen.getId_Galeria()));
        lstpar.add(new Parametro(4, imagen.getImagen()));
        String sql = "IINSERT INTO public.\"IMAGEN\"(\n" +
"	\"Id_Imagen\", \"Tipo_Imagen\", \"Id_Galeria\", \"Imagen\")\n" +
"	VALUES (?, ?, ?, ?);";            
        try {
            resp = AccesoDatos.ejecutaComando1(sql, lstpar);
        } catch (Exception ex) {
            Logger.getLogger(imagenLN.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        return resp;
    } 
}
