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

    public static void insertarFlora(Flora flora) {

        boolean resp = false;
        ArrayList<Parametro> lstpar = new ArrayList<>();
        lstpar.add(new Parametro(1, flora.getId_User()));
        lstpar.add(new Parametro(2, flora.getId_Familia()));
        lstpar.add(new Parametro(3, flora.getNombre_Flora()));
        lstpar.add(new Parametro(4, flora.getUbicacionX()));
        lstpar.add(new Parametro(5, flora.getUbicacionY()));
        lstpar.add(new Parametro(6, flora.getCod_Herbario()));
        lstpar.add(new Parametro(7, flora.getNombre_Investigador()));
        lstpar.add(new Parametro(8, flora.getId_Reserva()));
        lstpar.add(new Parametro(9, flora.getRecoleccion()));

        String sql = "INSERT INTO public.\"FLORA\"(\n"
                + "	\"Id_User\", \"Id_Familia\", \"Nombre_Flora\", \"UbicacionX\", \"UbicacionY\", \"Cod_Herbario\", \"Nombre_Investigador\", \"Id_Reserva\", \"Recoleccion\")\n"
                + "	VALUES (?, ?, ?, ?, ?, ?, ?, ?,?);";

        try {
            resp = AccesoDatos.ejecutaComando1(sql, lstpar);
        } catch (Exception ex) {
            Logger.getLogger(floraLN.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        //return resp;
    }

    public Flora obtenerFlora(int id) {

        Flora objflora = new Flora();
        String sql = "SELECT \"Id_Flora\", \"Nombre_Flora\"\n" +
"	FROM public.\"FLORA\"\n" +
"	WHERE \"Id_User\"= '"+ id+"'\n" +
"	ORDER BY \"Id_Flora\" DESC LIMIT 1;";

        try {
            ConjuntoResultado resultado = AccesoDatos.ejecutaQuery(sql);

            while (resultado.next()) {

                objflora.setId_Flora(resultado.getInt(0));
                objflora.setNombre_Flora(resultado.getString(1));

            }
        } catch (Exception ex) {
            Logger.getLogger(floraLN.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }

        return objflora;
    }
}
