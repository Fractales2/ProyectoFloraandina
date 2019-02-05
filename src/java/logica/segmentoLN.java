/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import accesodatos.Segmento;
import conexionBD.AccesoDatos;
import conexionBD.ConjuntoResultado;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class segmentoLN {

    public static ArrayList<Segmento> obtenerSegmento() {
        ArrayList<Segmento> listaSegmento = new ArrayList<>();
        String sql = "SELECT * FROM public.\"SEGMENTO\";";
        try {

            ConjuntoResultado resultado = AccesoDatos.ejecutaQuery(sql);
            Segmento segm;
            while (resultado.next()) {
                segm = new Segmento();
                segm.setId_Segmento(resultado.getInt(0));
                segm.setNombre_Segm(resultado.getString(1));
                listaSegmento.add(segm);
            }
        } catch (Exception ex) {
            Logger.getLogger(familaLN.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        return listaSegmento;
    }
    public static Segmento obtenerIdSegmento(Segmento segmento){
        Segmento idSegmento = new Segmento();
        String sql =  "SELECT \"Id_Segmento\"\n" +
"	FROM public.\"SEGMENTO\" WHERE \"Nombre_Segmento\"='"+segmento.getNombre_Segm()+"';";
        
        try {
        ConjuntoResultado resultado = AccesoDatos.ejecutaQuery(sql);
        
        while (resultado.next()){
            idSegmento.setId_Segmento(resultado.getInt(0));
            
        }
        }catch (Exception ex) {
            Logger.getLogger(familaLN.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
    }
        return idSegmento;
}
}
