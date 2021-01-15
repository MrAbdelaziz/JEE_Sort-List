/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Coder
 */
@Local
public interface NomLocal {
    
    public void add(String nom);
    public List<String> getnoms();
    public void trier();
    
}
