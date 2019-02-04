/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import accesodatos.Menu;
import accesodatos.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import logica.menuLN;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

/**
 *
 * @author dome9
 */
@Named
@SessionScoped
public class cMenu implements Serializable {

    private List<Menu> lista;
    private MenuModel model;

    @PostConstruct
    public void init() {
        this.listarMenus();
        model = new DefaultMenuModel();
        this.establecerPermisos();
    }

    public void listarMenus() {

        try {
            lista = menuLN.obtenerMenu();

        } catch (Exception e) {

        }
    }

    public void establecerPermisos() {
        
        FacesContext context = FacesContext.getCurrentInstance();
        Usuario us = (Usuario) context.getExternalContext().getSessionMap().get("usuario");
        
        for (Menu m : lista) {
            if (m.getTipo().equals("S")&& m.getTipoUsuario().equals(us.getTipo_User())) {
                DefaultSubMenu firstSubmenu = new DefaultSubMenu(m.getNombre());
                for (Menu i : lista) {
                    if (i.getSubmenu() == m.getCodigo()) {
                        DefaultMenuItem item = new DefaultMenuItem(i.getNombre());
                        item.setUrl(i.getUrl());
                        firstSubmenu.addElement(item);
                    }
                }
                model.addElement(firstSubmenu);
            } else {
                if ((m.getSubmenu() == 0)&& m.getTipoUsuario().equals(us.getTipo_User())) {
                    DefaultMenuItem item = new DefaultMenuItem(m.getNombre());
                     item.setUrl(m.getUrl());
                    model.addElement(item);
                }

            }
        }
    }
    
    public void cerrarSesion(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    }

    public List<Menu> getLista() {
        return lista;
    }

    public void setLista(List<Menu> lista) {
        this.lista = lista;
    }

    public MenuModel getModel() {
        return model;
    }

    public void setModel(MenuModel model) {
        this.model = model;
    }
}
