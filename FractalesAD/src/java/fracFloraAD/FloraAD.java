/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fracFloraAD;

import FracBasedeDatos.AccesoaDatos;
import fractalescomun.fracflora;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author ASUS
 */
public class FloraAD extends fracflora{
    void FloraCargar(ResultSet rsFlora) {
        try {
            
            this.setId_Flora(rsFlora.getString("Id_Flora"));
            this.setId_User(rsFlora.getString("Id_User"));   
            this.setId_Flora(rsFlora.getString("Id_Flora"));
            this.setId_Imagen(rsFlora.getString("Id_Imagen"));
            this.setId_Familia(rsFlora.getString("Id_Familia"));
            this.setNombre_Flora(rsFlora.getString("Nombre_Flora"));
            this.setUbicacionX(rsFlora.getDouble("UbicacionX"));
            this.setUbicacionY(rsFlora.getDouble("UbicacionY"));
            this.setCod_Herbario(rsFlora.getString("Cod_Herbario"));
            this.setNombre_Investigador(rsFlora.getString("Nombre_Investigador"));
        
        } catch (Exception e) {

        }
    }
    
}
