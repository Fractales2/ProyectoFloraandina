/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fracFloraLN;

import com.google.gson.Gson;
import FracBasedeDatos.AccesoaDatos;
import fracFloraAD.FloraAD;
import fracFloraAD.FlorasAD;

/**
 *
 * @author ASUS
 */
public class fracFloraLN {
    
    AccesoaDatos accesoDatos = new AccesoaDatos();
    Gson gson = new Gson();

    public String FloraCargar(String Id_Flora) {
        String result = "";
        if (accesoDatos.Connectar() != 0) {
            try {
                FlorasAD florasAD = new FlorasAD();
                florasAD.FloraCargar(accesoDatos, Id_Flora);
                result = gson.toJson(florasAD);
            } catch (Exception e) {

            }
        }
        return result;
    }
}
