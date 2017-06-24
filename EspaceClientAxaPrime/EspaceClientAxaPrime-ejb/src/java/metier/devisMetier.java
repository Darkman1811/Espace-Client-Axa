/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import dao.Devis;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author darkman
 */
@Stateless
@LocalBean
@WebService
public class devisMetier {
@PersistenceContext
EntityManager em;

    public void create(Devis devis){
        em.persist(devis);   
     
    }
    
    public void delete(Devis devis){
        Devis toremove=em.find(Devis.class, devis.getId());
        em.remove(toremove);
        em.flush();
    }
    
    public Devis read(Devis devis){
        return em.find(Devis.class,devis.getId());
    }
    
    public List<Devis> liste(){
     //   System.out.println(em.createNamedQuery("Devis.FindAll",Devis.class).getResultList().size());
        return em.createNamedQuery("Devis.FindAll",Devis.class).getResultList();
    }
}
