/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import utilidades.utilpath;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author ASUS
 */
@Named(value = "subirimagenMB")
@SessionScoped
public class subirimagenMB implements Serializable {

    public subirimagenMB() {
    }

     public void handleFileUpload(FileUploadEvent event) {
        UploadedFile file = event.getFile();
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        String realPath = utilpath.getPathDefinida(ec.getRealPath("/"));
        String pathDefinition = realPath + File.separator + "web" + File.separator + "images" + File.separator + file.getFileName();
        try {
            FileInputStream in = (FileInputStream) file.getInputstream();
            FileOutputStream out = new FileOutputStream(pathDefinition);

            byte[] buffer = new byte[(int) file.getSize()];
            int contador = 0;

            while ((contador = in.read(buffer)) != -1) {
                out.write(buffer, 0, contador);
            }
            in.close();
            out.close();

        } catch (IOException ioe) {
            ioe.printStackTrace();

        }
    }

}
