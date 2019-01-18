/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

/**
 *
 * @author ASUS
 */
public class UtilJsf {
    
    public static String guardarImagenTmp (byte[] bytes, String nombreArchivo){
    String ubicacionImage = null;
    ServletContext servlentContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
    String path = servlentContext.getRealPath("") + File.separatorChar + "resources"
            + File.separatorChar + "img" + File.separatorChar + "tmp"
            + File.separatorChar + nombreArchivo;
    File f = null;
    InputStream in = null;
    try{
        f = new File(path);
        in= new ByteArrayInputStream(bytes);
        FileOutputStream out = new FileOutputStream(f.getAbsolutePath());
        int c=0;
        while ((c= in.read())>=0){
        out.write(c);
        }
        out.flush();
        out.close();
        ubicacionImage = "../../resources/img/tmp" + nombreArchivo;
    }catch (Exception e){
    System.err.println("No se pudo cargar la imagen");
    }
    return ubicacionImage;
    }
}
