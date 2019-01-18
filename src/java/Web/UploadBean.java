/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web;

import Web.Util.UtilPath;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author Mario Silva
 */
@ManagedBean
@SessionScoped
public class UploadBean implements Serializable{

    /**
     * Creates a new instance of UploadBean
     */
    public UploadBean() {
    }

    public void handleFileUpload(FileUploadEvent event) {
        UploadedFile file = event.getFile();
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        String realPath = UtilPath.getPathDefinida(ec.getRealPath("/"));
        String pathDefinition = realPath + File.separator + "web" + File.separator + "galeriag" + File.separator + file.getFileName();
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
    //galeria tecnica frontal
    public void handleFileUpload1(FileUploadEvent event) {
        UploadedFile file = event.getFile();
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        String realPath = UtilPath.getPathDefinida(ec.getRealPath("/"));
        String pathDefinition = realPath + File.separator + "web" + File.separator + "galeriat" + File.separator + "frontal" + File.separator + file.getFileName();
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
    //corte
    public void handleFileUpload2(FileUploadEvent event) {
        UploadedFile file = event.getFile();
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        String realPath = UtilPath.getPathDefinida(ec.getRealPath("/"));
        String pathDefinition = realPath + File.separator + "web" + File.separator + "galeriat" + File.separator + "corte" + File.separator + file.getFileName();
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
     //lateral
    public void handleFileUpload3(FileUploadEvent event) {
        UploadedFile file = event.getFile();
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        String realPath = UtilPath.getPathDefinida(ec.getRealPath("/"));
        String pathDefinition = realPath + File.separator + "web" + File.separator + "galeriat" + File.separator + "lateral" + File.separator + file.getFileName();
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
     //senital
    public void handleFileUpload4(FileUploadEvent event) {
        UploadedFile file = event.getFile();
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        String realPath = UtilPath.getPathDefinida(ec.getRealPath("/"));
        String pathDefinition = realPath + File.separator + "web" + File.separator + "galeriat" + File.separator + "senital" + File.separator + file.getFileName();
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
    //galeria de archivcs
    
    //galeria tecnica frontal
    public void handleFileUpload5(FileUploadEvent event) {
        UploadedFile file = event.getFile();
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        String realPath = UtilPath.getPathDefinida(ec.getRealPath("/"));
        String pathDefinition = realPath + File.separator + "web" + File.separator + "galeriaA" + File.separator + "frontal" + File.separator + file.getFileName();
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
    //corte
    public void handleFileUpload6(FileUploadEvent event) {
        UploadedFile file = event.getFile();
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        String realPath = UtilPath.getPathDefinida(ec.getRealPath("/"));
        String pathDefinition = realPath + File.separator + "web" + File.separator + "galeriaA" + File.separator + "corte" + File.separator + file.getFileName();
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
     //lateral
    public void handleFileUpload7(FileUploadEvent event) {
        UploadedFile file = event.getFile();
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        String realPath = UtilPath.getPathDefinida(ec.getRealPath("/"));
        String pathDefinition = realPath + File.separator + "web" + File.separator + "galeriaA" + File.separator + "lateral" + File.separator + file.getFileName();
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
     //senital
    public void handleFileUpload8(FileUploadEvent event) {
        UploadedFile file = event.getFile();
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        String realPath = UtilPath.getPathDefinida(ec.getRealPath("/"));
        String pathDefinition = realPath + File.separator + "web" + File.separator + "galeriaA" + File.separator + "senital" + File.separator + file.getFileName();
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
