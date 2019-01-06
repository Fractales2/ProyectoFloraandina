package controlador;



import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.Part;
import org.primefaces.event.FileUploadEvent;


//@ManagedBean
//@ViewScoped


public class GaleriaManagedBean {
    
   
    private String Nombre_Flora;
    private double UbicacionX;
    private double UbicacionY;
    private String Cod_Herbario;
    private String Nombre_Investigador;
    private String Recoleccion;  //fecha
    private Part  image;
    private boolean upladed;

    public Part getImage() {
        return image;
    }

    public void setImage(Part image) {
        this.image = image;
    }
 

    public GaleriaManagedBean() {
    }

    public String getNombre_Flora() {
        return Nombre_Flora;
    }

    public void setNombre_Flora(String Nombre_Flora) {
        this.Nombre_Flora = Nombre_Flora;
    }

    public double getUbicacionX() {
        return UbicacionX;
    }

    public void setUbicacionX(double UbicacionX) {
        this.UbicacionX = UbicacionX;
    }

    public double getUbicacionY() {
        return UbicacionY;
    }

    public void setUbicacionY(double UbicacionY) {
        this.UbicacionY = UbicacionY;
    }

    public String getCod_Herbario() {
        return Cod_Herbario;
    }

    public void setCod_Herbario(String Cod_Herbario) {
        this.Cod_Herbario = Cod_Herbario;
    }

    public String getNombre_Investigador() {
        return Nombre_Investigador;
    }

    public void setNombre_Investigador(String Nombre_Investigador) {
        this.Nombre_Investigador = Nombre_Investigador;
    }

    public String getRecoleccion() {
        return Recoleccion;
    }

    public void setRecoleccion(String Recoleccion) {
        this.Recoleccion = Recoleccion;
    }

   
   

    
    public void subirImagen(){
        /*GaleriaManagedBean objMB = new  GaleriaManagedBean();
        objMB.setImagenFlora(event.getFile().getContents());
        //imagenFlora = ;*/
        
      try{
         InputStream in= image.getInputStream();
         File f = new File("/Desktop/upload/"+image.getSubmittedFileName());
         f.createNewFile();
         FileOutputStream out = new FileOutputStream(f);
         
         byte[] buffer = new byte[1024];
         int length;
         
         while ((length = in.read(buffer))>0){
             out.write(buffer, 0, length);
         }
         out.close();
         in.close();
         
         FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("path", f.getAbsolutePath());
         upladed= true;
         
      }catch(Exception e){
          e.printStackTrace(System.out);
      }
    }

    

    public boolean isUpladed() {
        return upladed;
    }

    public void setUpladed(boolean upladed) {
        this.upladed = upladed;
    }
    
   
    
    
}
