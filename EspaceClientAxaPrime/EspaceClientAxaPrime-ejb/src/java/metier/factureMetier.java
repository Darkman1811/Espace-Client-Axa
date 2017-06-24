/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import dao.Facture;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author darkman
 */
@Stateless
@LocalBean
public class factureMetier {
@PersistenceContext
EntityManager em;
    public Facture read(Facture facture){
        return em.find(Facture.class,facture.getId());
    }
    
    public List<Facture> liste(){
        System.out.println(em.createNamedQuery("Facture.FindAll",Facture.class).getResultList().size());
        return em.createNamedQuery("Facture.FindAll",Facture.class).getResultList();
    }
}
