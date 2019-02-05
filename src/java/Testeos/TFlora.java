/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testeos;

import accesodatos.Flora;
import accesodatos.Usuario;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import logica.floraLN;

/**
 *
 * @author dome9
 */
public class TFlora {

    public static void main(String[] args) throws ParseException {
        Flora usu = new Flora();
        usu.setId_User(1);
        usu.setId_Familia(1);
        usu.setNombre_Flora("rosa");
        usu.setUbicacionX(2.3);
        usu.setUbicacionY(9.8);
        usu.setCod_Herbario("porte");
        usu.setNombre_Investigador("charles");
        Date Recoleccion = new SimpleDateFormat().parse("2012/02/01");
        //usu.setRecoleccion(Recoleccion);
        usu.setId_Reserva(1);
        floraLN.insertarFlora(usu, 1, 1, 1);

    }
}
