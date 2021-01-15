/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBean;

import SessionBean.NomLocal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Coder
 */
@ManagedBean
@SessionScoped
public class NomManagedBean {

   @EJB
   NomLocal nomlocal;
   
   List<String> listnom = new ArrayList<String>();
   
   private String nom;
   
    public NomManagedBean() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
     public void add() {
         nomlocal.add(nom);
    }

    public List<String> getListnom() {
     
        return nomlocal.getnoms();
    }

    public void setListnom(List<String> listnom) {
        this.listnom = listnom;
    }
    
    
    
    public void trier(){
        nomlocal.trier();
    }
     

    
    
}
