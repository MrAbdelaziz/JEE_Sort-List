/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Coder
 */
@Stateless
public class Nom implements NomLocal {

    List<String> noms = new ArrayList<String>();
    
    @Override
    public void add(String nom) {
        this.noms.add(nom);
    }

    @Override
    public List<String> getnoms() {
        return this.noms;
    }

    @Override
    public void trier() {
        Collections.sort(noms);
    }
}
