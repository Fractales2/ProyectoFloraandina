/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testeos;

import accesodatos.Familia;
import accesodatos.Reservas;
import java.util.ArrayList;
import logica.familaLN;
import logica.reservaLN;

/**
 *
 * @author ASUS
 */
public class familiatest {
     public static void main(String[] args) {
         
        System.out.println("---Insertar familia---");
        Familia familia = new Familia();
        /*boolean resp = false;
        familia.setId_Familia("20");
        familia.setNombre_Familia("Ninbus2");
        if (resp = familaLN.insertarFamilia(familia)) {
            System.out.println("Exito al insertar...!!");
        } else {
            System.out.println("Error al insertar...???");
        }*/
        
        System.out.println("---Listado de familias---");
        ArrayList<Reservas> list = new ArrayList<>();
        list = reservaLN.obtenerReservas();
        for (Reservas s : list) {
            //System.out.println(s.getId_Familia());
            System.out.println(s.getNombre_Res());
            System.out.println();
        }
        
        
    }
     

}
