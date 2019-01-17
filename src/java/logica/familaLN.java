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
import accesodatos.Familia;
/**
 *
 * @author ASUS
 */
public class familaLN {
    
     public static boolean insertarFamilia(Familia familia) {
       
         boolean resp = false;
        ArrayList<Parametro> lstpar = new ArrayList<>();
        //lstpar.add(new Parametro(1,familia.getId_Familia()));
        lstpar.add(new Parametro(1, familia.getId_Familia()));
        lstpar.add(new Parametro(2, familia.getNombre_Familia()));
        String sql = "INSERT INTO public.\"FAMILIA\"(\n" +
"	\"Id_Familia\", \"Nombre_Familia\")\n" +
    "	VALUES (?,?);";            
        try {
            resp = AccesoDatos.ejecutaComando1(sql, lstpar);
        } catch (Exception ex) {
            Logger.getLogger(familaLN.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        return resp;
    }
     public static ArrayList<Familia> obtenerFamilias(){
     ArrayList<Familia> listaFamilia = new ArrayList<>();
     String sql="SELECT * FROM public.\"FAMILIA\";";
     try{
     
     ConjuntoResultado resultado = AccesoDatos.ejecutaQuery(sql);
     Familia fami;
     while(resultado.next()){
     fami = new Familia();
     //fami.setId_Familia(resultado.getString(0));
     fami.setNombre_Familia(resultado.getString(1));
     listaFamilia.add(fami);
     }
     }catch (Exception ex){
         Logger.getLogger(familaLN.class.getName()).log(Level.SEVERE, null, ex);  
             System.out.println(ex.getMessage());
     }
     return listaFamilia;
     }
     
      
    }
