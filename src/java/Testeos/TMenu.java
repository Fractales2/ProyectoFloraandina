/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testeos;

import accesodatos.Menu;
import java.util.ArrayList;
import logica.menuLN;

/**
 *
 * @author dome9
 */
public class TMenu {

    public static void main(String[] args) {
        ArrayList<Menu> listaMenu = new ArrayList<>();

        listaMenu = menuLN.obtenerMenu();
        for (Menu m : listaMenu) {
            System.out.println(m);
        }

    }
}
