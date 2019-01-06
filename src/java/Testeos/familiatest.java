/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testeos;

import accesodatos.Familia;
import logica.familaLN;

/**
 *
 * @author ASUS
 */
public class familiatest {
     public static void main(String[] args) {
         
        System.out.println("---Insertar marca---");
        Familia familia = new Familia();
        boolean resp = false;
        familia.setId_Familia("5");
        familia.setNombre_Familia("Ninbus");
        if (resp = familaLN.insertarFamilia(familia)) {
            System.out.println("Exito al insertar...!!");
        } else {
            System.out.println("Error al insertar...???");
        }
    }

}
