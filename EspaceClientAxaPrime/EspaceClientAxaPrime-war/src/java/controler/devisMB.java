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
public class devisMB {
    @EJB
    devisMetier metier;
    @EJB
    contratMetier contratmetier;
    
    private List<Devis> mesdevis;
    private Devis selectedDevis;
    public int dodo;

    public devisMetier getMetier() {
        return metier;
    }

    public void setMetier(devisMetier metier) {
        this.metier = metier;
    }

    public contratMetier getContratmetier() {
        return contratmetier;
    }

    public void setContratmetier(contratMetier contratmetier) {
        this.contratmetier = contratmetier;
    }

  
    
    
    
    public List<Devis> getMesdevis() {
        return metier.liste();
    }

    public void setMesdevis(List<Devis> mesdevis) {
        this.mesdevis = mesdevis;
    }

    public Devis getSelectedDevis() {
        return selectedDevis;
    }

    public void setSelectedDevis(Devis selectedDevis) {
        this.selectedDevis = selectedDevis;
    }
    
    public void validerDevis(){
        Contrat contrat=new Contrat();
        contrat.setNomService(selectedDevis.getNomService());
        contrat.setMontant(selectedDevis.getMontant());        
        contrat.setProduit(selectedDevis.getProduit());
        contrat.setVoitures(selectedDevis.getVoitures());      
        contratmetier.create(contrat);
    }
    
    
    
}
