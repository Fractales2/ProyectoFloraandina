/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import accesodatos.Analisis;
import accesodatos.Flora;
import conexionBD.AccesoDatos;
import conexionBD.Parametro;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class analisiLN {

    public static boolean insertarAnalisis(Analisis analisis) {

        boolean resp = false;
        ArrayList<Parametro> lstpar = new ArrayList<>();
        lstpar.add(new Parametro(1, analisis.getId_Flora()));
        lstpar.add(new Parametro(2, analisis.getId_Segmento()));
        lstpar.add(new Parametro(3, analisis.getDimension_Altura()));
        lstpar.add(new Parametro(4, analisis.getDimension_Ancho()));
        lstpar.add(new Parametro(5, analisis.getDimension_Razon()));
        lstpar.add(new Parametro(6, analisis.getDimension_Rango()));
        lstpar.add(new Parametro(7, analisis.getDescripcion()));
        lstpar.add(new Parametro(8, analisis.getFicha()));

        String sql = "INSERT INTO public.\"ANALISIS\"(\n"
                + "	\"Id_Flora\", \"Id_Segmento\", \"Dimension_Altura\", \"Dimension_Ancho\", \"Dimension_Razon\", \"Dimension_Rango\", \"Descripcion\", \"Ficha\")\n"
                + "	VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            resp = AccesoDatos.ejecutaComando1(sql, lstpar);
        } catch (Exception ex) {
            Logger.getLogger(analisiLN.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        return resp;
    }

}
