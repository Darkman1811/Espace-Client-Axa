/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import dao.Contrat;
import dao.Devis;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import metier.devisMetier;
import metier.contratMetier;

/**
 *
 * @author darkman
 */
@ManagedBean
@SessionScoped
public class contratMB {
   
    @EJB
    contratMetier metier;
    
    private List<Contrat> mescontrats;
    private Contrat selectedContrat;
    
    public List<Contrat> getMescontrats() {
        return metier.liste();
    }

    public void setMescontrats(List<Contrat> mescontrats) {
        this.mescontrats = mescontrats;
    }

    public Contrat getSelectedContrat() {
        return selectedContrat;
    }

    public void setSelectedContrat(Contrat selectedContrat) {
        this.selectedContrat = selectedContrat;
    }

   
    
   
    
    
    
}
