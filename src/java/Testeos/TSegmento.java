/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testeos;

import accesodatos.Segmento;
import logica.segmentoLN;

/**
 *
 * @author dome9
 */
public class TSegmento {
    public static void main(String[] args) {
        Segmento seg = new Segmento();
        seg.setNombre_Segm("Planta");
        Segmento segm = segmentoLN.obtenerIdSegmento(seg);
        System.out.println(segm.getId_Segmento());

    }
}
