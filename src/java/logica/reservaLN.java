/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import accesodatos.Reservas;
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
public class reservaLN {

    public static ArrayList<Reservas> obtenerReservas() {

        ArrayList<Reservas> listaReserva = new ArrayList<>();
        String sql = "SELECT * FROM public.\"RESERVA\";";

        try {
            ConjuntoResultado resultado = AccesoDatos.ejecutaQuery(sql);
            Reservas rese;
            while (resultado.next()) {
                rese = new Reservas();
                rese.setId_Reservas(resultado.getInt(0));
                rese.setNombre_Res(resultado.getString(1));
                listaReserva.add(rese);
            }
        } catch (Exception ex) {
            Logger.getLogger(familaLN.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        return listaReserva;
    }
 public static Reservas obtenerIdReserva(Reservas reserva){
     Reservas idreserva = new Reservas();   
     String sql =  "SELECT \"Id_Reserva\"\n" +
"	FROM public.\"RESERVA\" WHERE \"Nombre_Reserva\"='"+reserva.getNombre_Res()+"';";
        
        try {
        ConjuntoResultado resultado = AccesoDatos.ejecutaQuery(sql);
        
        while (resultado.next()){
            idreserva.setId_Reservas(resultado.getInt(0));
            
        }
        }catch (Exception ex) {
            Logger.getLogger(reservaLN.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
    }
        return idreserva;
}
}
