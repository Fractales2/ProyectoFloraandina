/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fracFloraAD;

import fracFloraLN.fracFloraLN;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ASUS
 */
@WebService(serviceName = "FractalesSW")
public class FractalesSW {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    @WebMethod(operationName = "FloraCargar")
    public String FloraCargar(@WebParam(name = "Id_Flora") String Id_Flora) {
        String result = "";
        try {
            fracFloraLN floraLN = new fracFloraLN();
            result = floraLN.FloraCargar(Id_Flora);
        } catch (Exception e) {
            result ="no hay conexion";
        }
        return result;
    }
}
