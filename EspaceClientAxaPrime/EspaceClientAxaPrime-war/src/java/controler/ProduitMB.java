/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import dao.Produit;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import metier.produitMetier;
import dao.Voiture;
import dao.Devis;
import metier.devisMetier;

/**
 *
 * @author darkman
 */
@ManagedBean
@SessionScoped
public class ProduitMB {
    @EJB
     produitMetier metier;
    @EJB
     devisMetier devismetier;
    private List<Produit> mesProduits;
    private Produit selectedProduit;

    public List<Produit> getMesProduits() {
       
        return metier.liste();
    }

    public void setMesProduits(List<Produit> mesProduits) {
        this.mesProduits = mesProduits;
    }

    public Produit getSelectedProduit() {
        return selectedProduit;
    }

    public void setSelectedProduit(Produit selectedProduit) {
        this.selectedProduit = selectedProduit;
    }
    
    public void demanderDevis(){
        System.out.println("devis cool");  
        Devis devis=new Devis();
        devis.setClient(null);
        devis.setConducteur(null);
        devis.setDateDevis("18/11/2016");
        devis.setMontant(new Float(25000));
        devis.setNomService("Assurance Auto");
        devis.setProduit(selectedProduit);
        devis.setStatus(5);
        devis.setStep("Demande");
        
        Voiture voiture=new Voiture();
        voiture.setId(new Long(1)); 
        List<Voiture> voitures=new ArrayList();
        voitures.add(voiture);
        devis.setVoitures(voitures);
        
        devismetier.create(devis);
    }   
    
}
