package controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author dome9
 */
@Named(value = "imagesView")

@ManagedBean
public class ContentFlow {
     
    private List<String> images;
     
    @PostConstruct
    public void init() {
        images = new ArrayList<String>();
        for(int i=1;i<=12;i++){
            images.add("img"+i+".jpg"); 
        }
           
             
    }
 
    
    public List<String> getImages() {
        return images;
    }
}
