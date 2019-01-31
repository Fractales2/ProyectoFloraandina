/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos;

/**
 *
 * @author ASUS
 */
public class Usuario {
    private Integer Id_User;
    private String Contrasena_User;
    private String Cedula_User;
    private String Nombre_User;
    private String Correo_User;
    private String Tipo_User;
    private String Estado_User;
    
    public Usuario() {
     
    }

    public Usuario(Integer Id_User, String Contrasena_User, String Cedula_User, String Nombre_User, String Correo_User, String Tipo_User, String Estado_User) {
        this.Id_User = Id_User;
        this.Contrasena_User = Contrasena_User;
        this.Cedula_User = Cedula_User;
        this.Nombre_User = Nombre_User;
        this.Correo_User = Correo_User;
        this.Tipo_User = Tipo_User;
        this.Estado_User = Estado_User;
    }

    

    public Integer getId_User() {
        return Id_User;
    }

    public void setId_User(Integer Id_User) {
        this.Id_User = Id_User;
    }

    public String getContrasena_User() {
        return Contrasena_User;
    }

    public void setContrasena_User(String Contrasena_User) {
        this.Contrasena_User = Contrasena_User;
    }

    public String getCedula_User() {
        return Cedula_User;
    }

    public void setCedula_User(String Cedula_User) {
        this.Cedula_User = Cedula_User;
    }

    public String getNombre_User() {
        return Nombre_User;
    }

    public void setNombre_User(String Nombre_User) {
        this.Nombre_User = Nombre_User;
    }

    public String getCorreo_User() {
        return Correo_User;
    }

    public void setCorreo_User(String Correo_User) {
        this.Correo_User = Correo_User;
    }

    public String getTipo_User() {
        return Tipo_User;
    }

    public void setTipo_User(String Tipo_User) {
        this.Tipo_User = Tipo_User;
    }

    public String getEstado_User() {
        return Estado_User;
    }

    public void setEstado_User(String Estado_User) {
        this.Estado_User = Estado_User;
    }
    
    
    
}
