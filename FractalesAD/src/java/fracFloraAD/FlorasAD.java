/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fracFloraAD;

import FracBasedeDatos.AccesoaDatos;
import fractalescomun.fracFloras;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class FlorasAD extends fracFloras{
    
    public void FloraCargar(AccesoaDatos accesoDatos, String Id_Flora) {
        try {
            String SQL = "SELECT \"Id_Flora\", \"Id_User\", \"Id_Imagen\", \"Id_Familia\", \"Nombre_Flora\", \"UbicacionX\", \"UbicacionY\", \"Recoleccion\", \"Cod_Herbario\", \"Nombre_Investigador\"\n" 
                    + " FROM \"FLORA\" WHERE \"Id_Flora\"='" + Id_Flora + "';";
            if (accesoDatos.EjecutarSQL(SQL) != 0) {
                ResultSet rsFlora = accesoDatos.getRs();
                while (rsFlora.next()) {
                    FloraAD floraAD = new FloraAD();
                    floraAD.FloraCargar(rsFlora);
                    this.getFlora().add(floraAD);
                    
                }
            }
            
        } catch (Exception e) {
            System.out.println(" Error de Conexion");
        }
    }

   
}
