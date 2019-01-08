/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import accesodatos.Galeria;
import conexionBD.AccesoDatos;
import conexionBD.Parametro;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class galeriaLN {
    public static boolean insertarGaleria(Galeria galeria) {
       
         boolean resp = false;
        ArrayList<Parametro> lstpar = new ArrayList<>();
         lstpar.add(new Parametro(1, galeria.getId_Galeria()));
        lstpar.add(new Parametro(2, galeria.getTipo_Galeria()));
        lstpar.add(new Parametro(3, galeria.getId_Flora()));
        String sql = "INSERT INTO public.\"GALERIA\"(\n" +
"	\"Id_Galeria\", \"Tipo_Galeria\", \"Id_Flora\")\n" +
"	VALUES (?, ?, ?);";            
        try {
            resp = AccesoDatos.ejecutaComando1(sql, lstpar);
        } catch (Exception ex) {
            Logger.getLogger(galeriaLN.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        return resp;
    }
}
